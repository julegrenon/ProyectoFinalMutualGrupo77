
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
    
 /*    public void guardarOrden(Orden orden){
        
        String sql="INSERT INTO `orden`(`idOrden`, `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador`) "
                + "VALUES  (?, ?, ?, ?, ?,?)";
          
        
        try {
            PreparedStatement ps=conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           ps.setInt(1, orden.getIdOrden());
           ps.setDate(2, Date.valueOf(orden.getFecha()));
           ps.setString(3, orden.getFormaPago());
           ps.setDouble(4, orden.getImporte());
           ps.setInt(5, orden.getAfiliado().getIdAfiliado());
          ps.setInt(6, orden.getPrestador().getIdPrestador());
           
            ps.executeUpdate();
            
            //Setea id
            ResultSet rs=ps.getGeneratedKeys();
            
            if (rs.next()){
                
                orden.setIdOrden(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Orden cargada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla orden");
        }
    }
   */
     //=============================================================================
     //ELIMINAR ORDENES
   
       public void eliminarOrden (int id){
        
        String sql="DELETE orden WHERE idOrden=?";
        
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
      
       
   //    =============================
       
           //AGREGAR ORDENES
    
    public void guardarOrden(Orden ordenNueva) {

        String sql = "INSERT INTO `orden`(`idOrden`, `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador`) "
                + "VALUES  (?, ?, ?, ?, ?,?)";

        Date fecha = null;
        //int idAfiliado;
        //int idPrestador;
        //variable booleana para validar si existe la orden con misma fecha y idPrestador
        
        try {
            boolean ordenEncontrada = false;
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            OrdenData ordenData = new OrdenData();
            //lista donde guarda las ordenes con el idAfiliado
            List<Orden> listaOrdenes = ordenData.buscaOrdenPorAfil(ordenNueva.getAfiliado().getIdAfiliado());

            LocalDate fechaBuscada=ordenNueva.getFecha();
            int idPrestadorOrdenNueva=ordenNueva.getPrestador().getIdPrestador();
            
            
            //recorre listaOrdenes
            for (Orden buscarOrden : listaOrdenes) {
                //compara idPrestador y fecha de la lista con la variable ordeNueva recibida por parametro en el método
                LocalDate fechaEncontrada=buscarOrden.getFecha();
                int idPrestador=buscarOrden.getPrestador().getIdPrestador();
                if (idPrestadorOrdenNueva == idPrestador && fechaBuscada.equals(fechaEncontrada)) {
                    ordenEncontrada = true;
                }
            }

            //creo que estas variables no hacen falta
            Afiliado Afiliado = new Afiliado();
            AfiliadoData afiData = new AfiliadoData();
            Prestador prestador = new Prestador();
            PrestadorData presta = new PrestadorData();
            // ArrayList<Orden> listA= new ArrayList();

            //si ordenEncontrada se mantiene en false procede a guardar la orden
            if (ordenEncontrada = false) {
                ps.setInt(1, ordenNueva.getIdOrden());
                ps.setDate(2, Date.valueOf(ordenNueva.getFecha()));
                ps.setString(3, ordenNueva.getFormaPago());
                ps.setDouble(4, ordenNueva.getImporte());
                ps.setInt(5, ordenNueva.getAfiliado().getIdAfiliado());
                ps.setInt(6, ordenNueva.getPrestador().getIdPrestador());
                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();

                /*       
           if (ordenData!=null){
               if(((ordenData.buscaOrdenPorFecha(Date(orden.getFecha()))) !=  (ps.setDate(2, Date.valueOf(ordenNueva.getFecha()))) ) ) &&
           
             ((orden.getPrestador().getIdPrestador()) !=  ps.setInt(6, ordenNueva.getPrestador().getIdPrestador())) && 
            
            
             (orden.getAfiliado().getIdAfiliado() !=    ps.setInt(5, ordenNueva.getAfiliado().getIdAfiliado())) 
          
            }
                 */
                if (rs.next()) {

                    ordenNueva.setIdOrden(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Orden cargada");
                }
                //si ordenEncontrada es true arroja el siguiente else   
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una orden de esa fecha con el mismo prestador");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla orden");
        }
    }
 
}
