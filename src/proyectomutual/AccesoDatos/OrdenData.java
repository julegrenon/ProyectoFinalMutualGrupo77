
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
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Orden;
import proyectomutual.entidades.Prestador;

public class OrdenData {
    
    public Connection conex=null;

    public OrdenData(){   
        conex=Conexion.getConexion();
    }
  
    //===============================================================================
    //AGREGAR ORDENES
    /*
     public void guardarOrden(Orden orden) {
try {
      
        PreparedStatement ps;
        
            //CONSULTA PARA VERIFICAR SI EL VALOR EXISTE
            
  
            String consulta ="SELECT COUNT(*) AS CANTIDAD  FROM orden WHERE fecha = "+orden.getFecha()+" AND idPrestador = "+orden.getPrestador().getIdPrestador()+" AND idAfiliado = "+orden.getAfiliado().getIdAfiliado();
           
            ps = conex.prepareStatement(consulta);
           ResultSet rs = ps.executeQuery();
          
            if (rs.next()) {
                int count = rs.getInt(1);
                 System.out.println("Cantidad: "+count);
                if (count == 0) {
                      String nuevosql = "INSERT INTO `orden`( `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador`)  VALUES  ( ?,?, ?, ?, ?)";
                    ps = conex.prepareStatement(nuevosql, Statement.RETURN_GENERATED_KEYS);
                    //  rs = ps.executeQuery();

                    // ps.setInt(1, orden.getIdOrden());
                    ps.setDate(1, Date.valueOf(orden.getFecha()));
                    ps.setString(2, orden.getFormaPago());
                    ps.setDouble(3, orden.getImporte());
                    ps.setInt(4, orden.getAfiliado().getIdAfiliado());
                    ps.setInt(5, orden.getPrestador().getIdPrestador());

                    ps.executeUpdate();
                    rs = ps.getGeneratedKeys();
                    orden.setIdOrden(rs.getInt(1));

                    JOptionPane.showMessageDialog(null, "Orden cargada");

              //  } else {
                 //   System.out.println("Ya sacó una orden en este día");
                }
            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla orden");
        } catch (NullPointerException ex1) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
*/
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
        String sql ="SELECT `idOrden`, `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador` "
                + "FROM `orden`";
                
        ArrayList<Orden> ordenLista = new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden= new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setIdOrden(rs.getInt("idAfiliado"));
                orden.setIdOrden(rs.getInt("idPrestador"));
                
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
         String sql="SELECT `idOrden`, `fecha`, `formaPago`, `importe`, `idPrestador` "
                   + "FROM `orden` WHERE idAfiliado=?";
                
        ArrayList<Orden> listaXAfil= new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden= new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setIdOrden(rs.getInt("idAfiliado"));
                orden.setIdOrden(rs.getInt("idPrestador"));
                
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
       
       public List<Orden> buscaOrdenPorFecha(Date date) {
         String sql="SELECT `idOrden`, `fecha`, `formaPago`, `importe`, `idPrestador` "
                   + "FROM `orden` WHERE fecha=?";
                
        ArrayList<Orden> listaXFecha= new ArrayList();
        try {
            PreparedStatement ps = conex.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orden orden= new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setIdOrden(rs.getInt("idAfiliado"));
                orden.setIdOrden(rs.getInt("idPrestador"));
                
                listaXFecha.add(orden);
             
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden");
        }
        return listaXFecha;
        
       }
 //======================================================0
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

            throw new GenericException("Solo puede sacar una orden por día");
        } else {
            resultado = true;
            return resultado;
        }
    }

}
