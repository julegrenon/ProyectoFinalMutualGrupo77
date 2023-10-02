/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Afiliado;

/**
 *
 * @author sonia
 */
public class AfiliadoData {

    private Connection con = null;

    public AfiliadoData() {
        con = Conexion.getConexion();
    }

    //Agrega un nuevo afiliado
    public void agregarAfiliado(Afiliado afiliado) {

        // ?=variable comodin
        String sql = "INSERT INTO afiliado (nombre, apellido, dni, telefono, domicilio, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // Setea los comodines
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDni());
            ps.setInt(4, afiliado.getTelefono());
            ps.setString(5, afiliado.getDomicilio());
            ps.setBoolean(6, afiliado.isEstado());

            ps.executeUpdate();

            //Setea id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                afiliado.setIdAfiliado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Afiliado agregado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla afiliados");
        }
    }

    //Listar todos los afiliados activos
    public List<Afiliado> listarAfiliados() {
        String sql = "SELECT idAfiliado, dni, apellido, nombre, telefono FROM afiliado WHERE estado=1";
        ArrayList<Afiliado> afiliadosLista = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Afiliado afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setEstado(true);

                afiliadosLista.add(afiliado);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla afiliados");
        }
        return afiliadosLista;
    }
}
