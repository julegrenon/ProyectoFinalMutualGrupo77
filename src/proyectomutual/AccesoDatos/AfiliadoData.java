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

    //Modificar datos de afiliado
    public void modificarAfiliado(Afiliado afiliado) {
        String sql = "UPDATE afiliado SET nombre=?, apellido=?, dni=?, telefono=?, domicilio=?"
                + "WHERE idAfiliado=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            // Setea los comodines
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDni());
            ps.setInt(4, afiliado.getTelefono());
            ps.setString(5, afiliado.getDomicilio());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Afiliado modificado");
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

    //Buscar afiliado x ID
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

    //Buscar afiliados x DNI
    public Afiliado buscarAfiliadoPorDni(int dni) {
        String sql = "SELECT idAfiliado, nombre, apellido, dni, telefono, domicilio FROM afiliado WHERE dni=? AND estado=1";
        Afiliado afiliado = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(dni);
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el afiliado con ese dni");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla afiliados");
        }
        return afiliado;
    }

    //Elimina el afiliado x ID cambiando su estado a inactivo
    public void eliminarAfiliado(int id) {

        String sql = "UPDATE afiliado SET estado=0 WHERE idAfiliado=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Afiliado eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla afiliados");
        }
    }
}
