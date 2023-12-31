package proyectomutual.AccesoDatos;

import Exceptions.GenericException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Prestador;


public class PrestadorData {
    
    private Connection conexion = null;
    private EspecialidadData especialidadData = new EspecialidadData();

    public PrestadorData() {
        conexion = Conexion.getConexion();
      
    }
    
    public void agregarPrestador(Prestador prestador) {
        try {
            PreparedStatement ps = null;
            if (comprobarPrestadorDNI(prestador)) {
                String sql = "INSERT INTO prestador (nombre, apellido, dni, domicilio, telefono, idEspecialidad, estado)"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?)";

                ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, prestador.getNombre());
                ps.setString(2, prestador.getApellido());
                ps.setInt(3, prestador.getDni());
                ps.setString(4, prestador.getDomicilio());
                ps.setInt(5, prestador.getTelefono());
                ps.setInt(6, prestador.getEspecialidad().getIdEspecialidad());
                ps.setBoolean(7, prestador.isEstado());

                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {

                    prestador.setIdPrestador(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Prestador guardado");
                }
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestadores");
        } catch (GenericException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el prestador: " + ex.getMessage());
        }
    }

    public void modificarPrestador(Prestador prestador) {
        try {
            PreparedStatement ps = null;
            if (comprobarPrestadorDNI(prestador)) {
                String sql = "UPDATE prestador SET nombre=?, apellido=?, dni=?, domicilio=?, telefono=?, idEspecialidad=?, estado=? WHERE idPrestador=?";

                ps = conexion.prepareStatement(sql);

                ps.setString(1, prestador.getNombre());
                ps.setString(2, prestador.getApellido());
                ps.setInt(3, prestador.getDni());
                ps.setString(4, prestador.getDomicilio());
                ps.setInt(5, prestador.getTelefono());
                ps.setInt(6, prestador.getEspecialidad().getIdEspecialidad());
                ps.setBoolean(7, prestador.isEstado());

                // Establece el valor del ID en la cláusula WHERE
                ps.setInt(8, prestador.getIdPrestador());

                int exito = ps.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Prestador modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el prestador. El ID no existe.");
                }
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        } catch (GenericException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el prestador: " + ex.getMessage());
        }
    }

    private boolean comprobarPrestadorDNI(Prestador prestador) throws GenericException, SQLException {

        PreparedStatement preparedStatement = null;
        boolean resultado = false;
        String dateQuery = "SELECT * FROM prestador WHERE dni = ?";
        preparedStatement = conexion.prepareStatement(dateQuery);
        preparedStatement.setInt(1, prestador.getDni());

        ResultSet resultSet = preparedStatement.executeQuery();
        resultado = resultSet.next();

        if (resultado) {
            System.out.println(resultado);
            throw new GenericException("Ya existe un prestador con ese DNI");
        } else {
            resultado = true;
            return resultado;
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
    
    public Prestador buscarPrestador(int id) {
        String sql = "SELECT nombre, apellido, dni, telefono, domicilio, idEspecialidad FROM prestador WHERE idPrestador=? AND estado=1";
        Prestador prestador = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prestador = new Prestador();
                prestador.setIdPrestador(id);
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setTelefono(rs.getInt("telefono"));
                prestador.setDomicilio(rs.getString("domicilio"));

                //Recupera la especialidad a través del id de la columna idEspecialidad
                EspecialidadData especialidadData = new EspecialidadData();
                int idEspecialidad = rs.getInt("idEspecialidad");
                Especialidad especialidad = especialidadData.buscarEspecialidad(idEspecialidad);

                //Setea especialidad después del método buscarEspecialidad  
                prestador.setEspecialidad(especialidad);
                prestador.setEstado(true);
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe prestador con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        }
        return prestador;
    }
    
        public Prestador buscarPrestadorPorDni(int dni){
        String sql="SELECT idPrestador, nombre, domicilio, telefono, idEspecialidad FROM prestador WHERE dni=? AND estado=1";
        Prestador prestador=null;
        try {
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs=ps.executeQuery();
            
            if (rs.next()){
                prestador=new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setDni(dni);
                prestador.setTelefono(rs.getInt("telefono"));
                
                int especialidadInt = rs.getInt("idEspecialidad");
                Especialidad especialidad = especialidadData.buscarEspecialidad(especialidadInt);

                prestador.setEspecialidad(especialidad);
                prestador.setEstado(true);
                
                JOptionPane.showMessageDialog(null, "DNI: "+ dni + " ¡Encontrado con éxito!");
            } else {
                JOptionPane.showMessageDialog(null, "No existe prestador con ese dni");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        }
        return prestador;
    }
        
        public List<Prestador> listarPrestador() {
        String sql = "SELECT idPrestador, nombre, apellido, dni, domicilio, telefono, idEspecialidad FROM prestador WHERE estado=1";
        ArrayList<Prestador> prestadorLista = new ArrayList<>();

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Prestador prestador = new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getInt("telefono"));
                
                //Recupera la especialidad a través del id de la columna idEspecialidad
                EspecialidadData especialidadData = new EspecialidadData();
                int idEspecialidad = rs.getInt("idEspecialidad");
                Especialidad especialidad = especialidadData.buscarEspecialidad(idEspecialidad);

                //Setea especialidad después del método buscarEspecialidad  
                prestador.setEspecialidad(especialidad);
                prestador.setEstado(true);

                prestadorLista.add(prestador);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        }

        return prestadorLista;
    }
        
        
        public List <Prestador> listaPrestadorEspecialidad(int idEspecialidad){
        
            String sql="SELECT `idPrestador`, `nombre`, `apellido`, `dni`, `telefono`, `domicilio`, `idEspecialidad`, `estado` "
                    + "FROM `prestador` WHERE  idEspecialidad=?";
             ArrayList<Prestador> prestadorLista = new ArrayList<>();
            
          Prestador prestador= null;
        try {
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, idEspecialidad);
            
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()){
                prestador=new Prestador();
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setDni(rs.getInt("dni"));
                prestador.setTelefono(rs.getInt("telefono"));
                
                int especialidadInt = rs.getInt("idEspecialidad");
                Especialidad especialidad = especialidadData.buscarEspecialidad(especialidadInt);
                
                prestador.setEspecialidad(especialidad);
                prestador.setEstado(true);
                
                prestadorLista.add(prestador);
                
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador");
        }
        return prestadorLista;
    }
        
}
    

