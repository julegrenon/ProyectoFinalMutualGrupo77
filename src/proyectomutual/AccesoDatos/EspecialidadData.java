/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomutual.AccesoDatos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Especialidad;

public class EspecialidadData {
    public Connection con=null;
    
    public EspecialidadData(){   
        con=Conexion.getConexion();
        
       } 


    // Método para agregar una nueva especialidad a la base de datos.
    public void agregarEspecialidad(Especialidad especialidad) {
        String query = "INSERT INTO Especialidad (idEspecialidad, especialidad) VALUES (?, ?)";
        try (PreparedStatement st = conex.prepareStatement(query)) {
           
            st.setInt(1,especialidad.getIdEspecialidad());
            st.setString(2,especialidad.getEspecialidad());
            st.executeUpdate();
            
     ResultSet Rs=  st.getGeneratedKeys();
     
     if(Rs.next()){
     
         especialidad.setIdEspecialidad(st.getMoreResults(0));
         
         
         
      }
    }

        
    // Método para obtener todas las especialidades de la base de datos y devolverlas como una lista.
    public List<Especialidad> obtenerEspecialidades() {
        List<Especialidad> especialidades = new ArrayList<>();
        String query = "SELECT * FROM Especialidad";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Especialidad especialidad = new Especialidad(
                    resultSet.getInt("id"),
                    resultSet.getString("codigo"),
                    resultSet.getString("tipo")
                );
                especialidades.add(especialidad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return especialidades;
    }

    // Método para actualizar una especialidad en la base de datos.
    public void actualizarEspecialidad(Especialidad especialidad) {
        String query = "UPDATE Especialidad SET codigo = ?, tipo = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, especialidad.getCodigo());
            statement.setString(2, especialidad.getTipo());
            statement.setInt(3, especialidad.getId());
            statement.executeUpdate(); // Ejecuta la actualización en la base de datos.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar una especialidad de la base de datos por su ID.
    public void eliminarEspecialidad(int especialidadId) {
        String query = "DELETE FROM Especialidad WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, especialidadId);
            statement.executeUpdate(); // Ejecuta la eliminación en la base de datos.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
  public Afiliado buscarAfiliado(int id) {
        String sql = "SELECT nombre, apellido, dni, telefono, domicilio FROM afiliado WHERE idAfiliado=? AND estado=1";
        Afiliado afiliado = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(id);
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el afiliado con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla afiliados");
        }
        return afiliado;
    }
   public Especialidad buscarEspecialidad(int id) {
        String sql = "SELECT idEspecialidad, especialidad FROM especialidad WHERE idEspecialidad=?";
        Especialidad especialidad = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                especialidad = new Especialidad();
                especialidad.setIdEspecialidad(id);
                especialidad.setEspecialidad(rs.getString("especialidad"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el especialidad con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla especialidad");
        }
        return especialidad;
    }
    
}