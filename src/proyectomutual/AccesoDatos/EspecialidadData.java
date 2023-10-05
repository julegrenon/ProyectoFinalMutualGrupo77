/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.AccesoDatos;

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

/**
 *
 * @author sonia
 */
public class EspecialidadData {

    private Connection con = null;

    public EspecialidadData() {
        con = Conexion.getConexion();
    }

    //Agrega una nueva especialidad
    // Agregar excepcion si se repite la especialidad
    public void agregarEspecialidad(Especialidad especialidad) {

        // ?=variable comodin
        String sql = "INSERT INTO especialidad (especialidad)"
                + "VALUES (?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //Setea los comodines
            ps.setString(1, especialidad.getEspecialidad());

            ps.executeUpdate();

            //Setea id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                especialidad.setIdEspecialidad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Especialidad agregada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla especialidad");
        }
    }

    //Lista todas las especialidades
    public List<Especialidad> listarEspecialidades() {
        String sql = "SELECT idEspecialidad, especialidad FROM especialidad";
        ArrayList<Especialidad> especialidadesLista = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setIdEspecialidad(rs.getInt("idEspecialidad"));
                especialidad.setEspecialidad(rs.getNString("especialidad"));

                especialidadesLista.add(especialidad);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return especialidadesLista;
    }

    //Buscar especialidad x ID
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
