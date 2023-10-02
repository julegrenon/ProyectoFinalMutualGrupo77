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
import proyectomutual.entidades.Especialidad;

public class EspecialidadData {
    private Connection connection;

    public EspecialidadData(Connection connection) {
        this.connection = connection;
    }

    // Método para agregar una nueva especialidad a la base de datos.
    public void agregarEspecialidad(Especialidad especialidad) {
        String query = "INSERT INTO Especialidad (codigo, tipo) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, especialidad.getCodigo());
            statement.setString(2, especialidad.getTipo());
            statement.executeUpdate(); // Ejecuta la inserción en la base de datos.
        } catch (SQLException e) {
            e.printStackTrace();
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
}