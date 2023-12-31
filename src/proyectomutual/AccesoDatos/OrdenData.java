
package proyectomutual.AccesoDatos;

import Exceptions.GenericException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Orden;
import proyectomutual.entidades.Prestador;

public class OrdenData {

    public Connection conex = null;
    private EspecialidadData especialidadData = new EspecialidadData();

    public OrdenData() {
        conex = Conexion.getConexion();
    }

//METODO AGREGAR ORDEN
//==============================================================================
    public void guardarOrden(Orden orden) {

        try {

            PreparedStatement preparedStatement = null;
            if (comprobarPrestadorFecha(orden)) {
                String insertQuery = "INSERT INTO orden(fecha,formaPago,importe,idAfiliado,idPrestador) VALUES (?,?,?,?,?)";

                preparedStatement = conex.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setDate(1, java.sql.Date.valueOf(orden.getFecha()));
                preparedStatement.setString(2, orden.getFormaPago());
                preparedStatement.setDouble(3, orden.getImporte());
                preparedStatement.setInt(4, orden.getAfiliado().getIdAfiliado());
                preparedStatement.setInt(5, orden.getPrestador().getIdPrestador());

                preparedStatement.executeUpdate();

                ResultSet resulSet = preparedStatement.getGeneratedKeys();
                if (resulSet.next()) {
                    orden.setIdOrden(resulSet.getInt(1));
                    JOptionPane.showMessageDialog(null, "Orden añadida con exito.");
                }
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdenData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GenericException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la Orden: " + ex.getMessage());
        }

    }

    private boolean comprobarPrestadorFecha(Orden orden) throws GenericException, SQLException {

        PreparedStatement preparedStatement = null;
        boolean resultado = false;
        String dateQuery = "SELECT * FROM orden WHERE fecha = ? AND idPrestador = ? AND idAfiliado = ?";
        preparedStatement = conex.prepareStatement(dateQuery);
        preparedStatement.setDate(1, java.sql.Date.valueOf(orden.getFecha()));
        preparedStatement.setInt(2, orden.getPrestador().getIdPrestador());
        preparedStatement.setInt(3, orden.getAfiliado().getIdAfiliado());

        ResultSet resultSet = preparedStatement.executeQuery();
        resultado = resultSet.next();

        if (resultado) {
            System.out.println(resultado);
            throw new GenericException("Solo puede sacar una orden por día");
        } else {
            resultado = true;
            return resultado;
        }
    }
    //=============================================================================
    //ELIMINAR ORDENES

    public void eliminarOrden(int id) {

        String sql = "DELETE FROM `orden` WHERE idOrden=?";

        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Orden eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de ordenes");
        }
    }
    //============================================================================ 
    //LISTAR  OREDENES

    public List<Orden> listarOrdenes() {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador FROM orden";
        ArrayList<Orden> ordenLista = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Recupera la idAfiliado y idPrestador a través del id de las columnas de base
                int idAfiliado = rs.getInt("idAfiliado");
                int idPrestador = rs.getInt("idPrestador");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                ordenLista.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return ordenLista;

    }

    //====================================================================================  
    //LISTA DE OREDENES POR AFILIADO
    public List<Orden> buscaOrdenPorAfil(int idAfiliado) {
        String sql = "SELECT `idOrden`, `fecha`, `formaPago`, `importe`, `idPrestador` "
                + "FROM `orden` WHERE idAfiliado=?";

        ArrayList<Orden> listaXAfil = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Recupera la idAfiliado y idPrestador a través del id de las columnas de base
                int idPrestador = rs.getInt("idPrestador");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaXAfil.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaXAfil;

    }
    //===================================================================
    //LISTA DE OREDENES POR FECHA

    public List<Orden> buscaOrdenPorFecha(LocalDate date) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE fecha=?";

        ArrayList<Orden> listaXFecha = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(date));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(date);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Recupera la idAfiliado y idPrestador a través del id de las columnas de base
                int idAfiliado = rs.getInt("idAfiliado");
                int idPrestador = rs.getInt("idPrestador");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaXFecha.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaXFecha;

    }

    public List<Orden> buscaOrdenPorPrestador(int idPrestador) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado "
                + "FROM orden WHERE idPrestador=?";

        ArrayList<Orden> listaOrdenesXPrestador = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idPrestador);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Recupera la idAfiliado a través del id de las columnas de base
                int idAfiliado = rs.getInt("idAfiliado");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenesXPrestador.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenesXPrestador;

    }

    //Buscar orden por afiliado, prestador y fecha
    public List<Orden> buscaOrdenPorAfiliadoPrestadorYFecha(int idAfiliado, int idPrestador, LocalDate fecha) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idAfiliado=? AND idPrestador=? AND fecha=?";

        ArrayList<Orden> listaOrdenXAfiliadoPrestadorYFecha = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ps.setInt(2, idPrestador);
            ps.setDate(3, Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(fecha);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenXAfiliadoPrestadorYFecha.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenXAfiliadoPrestadorYFecha;

    }

    //Buscar orden por afiliado y prestador
    public List<Orden> buscaOrdenPorAfiliadoYPrestador(int idAfiliado, int idPrestador) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idAfiliado=? AND idPrestador=?";

        ArrayList<Orden> listaOrdenAfiliadoYPrestador = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ps.setInt(2, idPrestador);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenAfiliadoYPrestador.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenAfiliadoYPrestador;

    }

    //Buscar orden por afiliado y fecha
    public List<Orden> buscaOrdenPorAfiliadoYFecha(int idAfiliado, LocalDate fecha) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idAfiliado=? AND fecha=?";

        ArrayList<Orden> listaOrdenAfiliadoYFecha = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ps.setDate(2, Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(fecha);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Recupera la idAfiliado a través del id de las columnas de base
                int idPrestador = rs.getInt("idPrestador");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenAfiliadoYFecha.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenAfiliadoYFecha;

    }

    //Lista ordenes por prestador y fecha
    public List<Orden> buscaOrdenPorPrestadorYFecha(int idPrestador, LocalDate fecha) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idPrestador=? AND fecha=?";

        ArrayList<Orden> listaOrdenPrestadorYFecha = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idPrestador);
            ps.setDate(2, Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(fecha);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Recupera la idAfiliado a través del id de las columnas de base
                int idAfiliado = rs.getInt("idAfiliado");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenPrestadorYFecha.add(orden);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenPrestadorYFecha;

    }

    public HashSet<Orden> buscaOrdenPorAfiliadoPrestadorFechaYEspecialidad(int idAfiliado, int idPrestador, LocalDate fecha, int idEspecialidad) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idAfiliado=? AND idPrestador=? AND fecha=?";

        HashSet<Orden> listaOrdenesXTodosLosFiltros = new HashSet();

        ArrayList<Orden> listaOrdenXAfiliadoPrestadorYFecha = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ps.setInt(2, idPrestador);
            ps.setDate(3, Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(fecha);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenXAfiliadoPrestadorYFecha.add(orden);

                for (Orden ordenes : listaOrdenXAfiliadoPrestadorYFecha) {
                    if (ordenes.getPrestador().getEspecialidad().getIdEspecialidad() == idEspecialidad) {
                        listaOrdenesXTodosLosFiltros.add(ordenes);
                    }
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenesXTodosLosFiltros;
    }

    public HashSet<Orden> buscaOrdenPorAfiliadoPrestadorYEspecialidad(int idAfiliado, int idPrestador, int idEspecialidad) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idAfiliado=? AND idPrestador=?";

        HashSet<Orden> listaOrdenesXTodosLosFiltros = new HashSet();

        ArrayList<Orden> listaOrdenXAfiliadoPrestadorYEspecialidad = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ps.setInt(2, idPrestador);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenXAfiliadoPrestadorYEspecialidad.add(orden);

                for (Orden ordenes : listaOrdenXAfiliadoPrestadorYEspecialidad) {
                    if (ordenes.getPrestador().getEspecialidad().getIdEspecialidad() == idEspecialidad) {
                        listaOrdenesXTodosLosFiltros.add(ordenes);
                    }
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenesXTodosLosFiltros;
    }

    public HashSet<Orden> buscaOrdenPorAfiliadoFechaYEspecialidad(int idAfiliado, LocalDate fecha, int idEspecialidad) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idAfiliado=? AND fecha=?";

        HashSet<Orden> listaOrdenesXTodosLosFiltros = new HashSet();

        ArrayList<Orden> listaOrdenXAfiliadoFechaYEspecialidad = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ps.setDate(2, Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(fecha);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                int idPrestador = rs.getInt("idPrestador");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenXAfiliadoFechaYEspecialidad.add(orden);

                for (Orden ordenes : listaOrdenXAfiliadoFechaYEspecialidad) {
                    if (ordenes.getPrestador().getEspecialidad().getIdEspecialidad() == idEspecialidad) {
                        listaOrdenesXTodosLosFiltros.add(ordenes);
                    }
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenesXTodosLosFiltros;
    }

    public HashSet<Orden> buscaOrdenPorAfiliadoYEspecialidad(int idAfiliado, int idEspecialidad) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idAfiliado=?";

        HashSet<Orden> listaParaFiltrar = new HashSet();
        
        List<Orden> listaOrdenesXTodosLosFiltros = new ArrayList();

        ArrayList<Orden> listaOrdenXAfiliadoYEspecialidad = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idAfiliado);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                int idPrestador = rs.getInt("idPrestador");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenXAfiliadoYEspecialidad.add(orden);

                for (Orden ordenes : listaOrdenXAfiliadoYEspecialidad) {
                    if (ordenes.getPrestador().getEspecialidad().getIdEspecialidad() == idEspecialidad) {
                            listaParaFiltrar.add(ordenes);
                    }
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaParaFiltrar;
    }

    public HashSet<Orden> buscaOrdenPorPrestadorFechaYEspecialidad(int idPrestador, LocalDate fecha, int idEspecialidad) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE idPrestador=? AND fecha=?";

        HashSet<Orden> listaOrdenesXTodosLosFiltros = new HashSet();

        ArrayList<Orden> listaOrdenXPrestadorYFecha = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, idPrestador);
            ps.setDate(2, Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(fecha);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                int idAfiliado = rs.getInt("idAfiliado");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenXPrestadorYFecha.add(orden);

                for (Orden ordenes : listaOrdenXPrestadorYFecha) {
                    if (ordenes.getPrestador().getEspecialidad().getIdEspecialidad() == idEspecialidad) {
                        listaOrdenesXTodosLosFiltros.add(ordenes);
                    }
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenesXTodosLosFiltros;
    }

    public HashSet<Orden> buscaOrdenPorFechaYEspecialidad(LocalDate fecha, int idEspecialidad) {
        String sql = "SELECT idOrden, fecha, formaPago, importe, idAfiliado, idPrestador "
                + "FROM orden WHERE fecha=?";

        HashSet<Orden> listaOrdenesXTodosLosFiltros = new HashSet();

        ArrayList<Orden> listaOrdenXFecha = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden = new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(fecha);
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getDouble("importe"));

                int idAfiliado = rs.getInt("idAfiliado");
                int idPrestador = rs.getInt("idPrestador");

                //Variables data
                PrestadorData prestadorData = new PrestadorData();
                AfiliadoData afiliadoData = new AfiliadoData();

                //Llamada a métodos para instanciar objeto necesario del constructor de orden
                Afiliado afiliado = afiliadoData.buscarAfiliado(idAfiliado);
                Prestador prestador = prestadorData.buscarPrestador(idPrestador);

                //Setea afiliado y prestador después de los métodos buscar  
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);

                listaOrdenXFecha.add(orden);

                for (Orden ordenes : listaOrdenXFecha) {
                    if (ordenes.getPrestador().getEspecialidad().getIdEspecialidad() == idEspecialidad) {
                        listaOrdenesXTodosLosFiltros.add(ordenes);
                    }
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaOrdenesXTodosLosFiltros;
    }

    public List<Orden> buscaOrdenPorEspecialidad(int idEspecialidad) {
        List<Orden> listaOrdenes = listarOrdenes();

        List<Orden> listaOrdenesXEspecialidad = new ArrayList();
        try {

            for (Orden ordenes : listaOrdenes) {
                if (ordenes.getPrestador().getEspecialidad().getIdEspecialidad() == idEspecialidad) {
                    listaOrdenesXEspecialidad.add(ordenes);
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No existen ordenes con esa especialidad");
        }
        return listaOrdenesXEspecialidad;

    }

}
