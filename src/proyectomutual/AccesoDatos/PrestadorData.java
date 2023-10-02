package proyectomutual.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Prestador;


public class PrestadorData {
    
    private Connection conexion = null;

    public PrestadorData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarPrestador(Prestador prestador){
        

        String sql="INSERT INTO prestador (nombre, DNI, domicilio, telefono, especialidad, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps=conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, prestador.getNombre());
            ps.setInt(2, prestador.getDNI());
            ps.setString(3, prestador.getDomicilio());
            ps.setInt(4, prestador.getTelefono());
            ps.setString(5, prestador.getEspecialidad());
            ps.setBoolean(6, prestador.isEstado());
            
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
    
}
