
package proyectomutual.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectomutual.entidades.Orden;

public class OrdenData {
    
    public Connection conex=null;

    public OrdenData(){   
        conex=Conexion.getConexion();
    }
    
     public void guardarOrden(Orden orden){
        
        // ?=variable comodin
        String sql="INSERT INTO `orden`(`idOrden`, `fecha`, `formaPago`, `importe`, `idAfiliado`, `idPrestador`) "
                + "VALUES  (?, ?, ?, ?, ?,?)";
          
        
        try {
            PreparedStatement ps=conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           ps.setInt(1, orden.getIdOrden());
           ps.setDate(1, Date.valueOf(orden.getFecha()));
           ps.setString(2, orden.getFormaPago());
           ps.setDouble(3, orden.getImporte());
           ps.setInt(4, orden.getAfiliado().getIdAfiliado());
          ps.setInt(5, orden.getPrestador().getIdPrestador());
           
            ps.executeUpdate();
            
            //Setea id
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                
                orden.setIdOrden(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Orden cargada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
        }
    }
    
   
    
}
