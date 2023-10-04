package proyectomutual.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Prestador;


public class PrestadorData {
    
    private Connection conexion = null;

    public PrestadorData() {
        conexion = Conexion.getConexion();
    }
    
    public void agregarPrestador(Prestador prestador){
        

        String sql="INSERT INTO prestador (nombre, dni, domicilio, telefono, especialidad, activo)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps=conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, prestador.getNombre());
            ps.setInt(2, prestador.getDni());
            ps.setString(3, prestador.getDomicilio());
            ps.setInt(4, prestador.getTelefono());
            ps.setInt(5, prestador.getEspecialidad().getIdEspecialidad());
            ps.setBoolean(6, prestador.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                
                prestador.setIdPrestador(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Prestador guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestadores");
        }
    }
    
    public void modificarPrestador(Prestador prestador){
        String sql="UPDATE prestador SET nombre=?, dni=?, domicilio=?, telefono=?, especialidad=?, activo=?"
                + "WHERE idPrestador=?";
        
        try {
            PreparedStatement ps=conexion.prepareStatement(sql);
            
            ps.setString(1, prestador.getNombre());
            ps.setInt(2, prestador.getDni());
            ps.setString(3, prestador.getDomicilio());
            ps.setInt(4, prestador.getTelefono());
            ps.setInt(5, prestador.getEspecialidad().getIdEspecialidad());
            ps.setBoolean(6, prestador.isActivo());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Prestador modificado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        }
    }
    
    public void eliminarPrestador(int id){
        
        String sql="UPDATE prestador SET estado=0 WHERE idPrestador=?";
        
        try {
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Prestador eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        }
    }
    
    public Prestador buscarPrestador(int id){
        String sql="SELECT nombre, dni, domicilio, telefono, idEspecialidad FROM prestador WHERE idPrestador=? AND estado=1";
        Prestador prestador=null;
        try {
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()){
                prestador=new Prestador();
                prestador.setIdPrestador(id);
                prestador.setNombre(rs.getString("nombre"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getInt("telefono"));
                
                int especialidadInt = rs.getInt("especialidad");
                Especialidad especialidad = new Especialidad(especialidadInt);

                prestador.setEspecialidad(especialidad);
                prestador.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe prestador con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        }
        return prestador;
    }
    
    
    
}
