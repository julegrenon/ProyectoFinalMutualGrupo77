
package proyectomutual.AccesoDatos;

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
     public void guardarOrden(Orden orden) {

        String nuevosql = "INSERT INTO `orden`(`idOrden`, `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador`) "
                + "VALUES  (?, ?, ?, ?, ?,?)";

        PreparedStatement ps;
        System.out.println("Guardar Orden: " + orden);
        try {
            //CONSULTA PARA VERIFICAR SI EL VALOR EXISTE

            String consulta = "SELECT COUNT(*) FROM orden WHERE idOrden = ?" + orden.getIdOrden();
            ps = conex.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int count = rs.getInt(1);
                if (count == 0) {

                    ps = conex.prepareStatement(nuevosql);
                    rs = ps.executeQuery();
                    ps.setInt(1, orden.getIdOrden());
                    ps.setDate(2, Date.valueOf(orden.getFecha()));
                    ps.setString(3, orden.getFormaPago());
                    ps.setDouble(4, orden.getImporte());
                    ps.setInt(5, orden.getAfiliado().getIdAfiliado());
                    ps.setInt(6, orden.getPrestador().getIdPrestador());

                    ps.executeUpdate();

                } else {
                    System.out.println("El valor ya existe");
                }
            }
            //Setea id, recupera id
            rs = ps.getGeneratedKeys();
            orden.setIdOrden(rs.getInt(1));

            JOptionPane.showMessageDialog(null, "Orden cargada");

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla orden");
        }
    }

     //=============================================================================
     //ELIMINAR ORDENES
   
       public void eliminarOrden (int id){
        
        String sql="DELETE FROM `orden` WHERE idOrden=?";
        
        try {
            PreparedStatement ps=conex.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
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
 
}
