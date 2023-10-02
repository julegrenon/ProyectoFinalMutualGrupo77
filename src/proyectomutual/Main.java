/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual;

import proyectomutual.AccesoDatos.AfiliadoData;
import proyectomutual.entidades.Afiliado;

/**
 *
 * @author sonia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //PRUEBA DE METODOS afiliadoData
        //Connection con= Conexion.getConexion();
       // Afiliado afiliado = new Afiliado("Ana", "Ruiz", 123456, 1123456789, "calle falsa 123", true);
        AfiliadoData afi = new AfiliadoData();
        //afi.agregarAfiliado(afiliado);
        
        //PRUEBA LISTAR TODOS LOS ALUMNOS
        for (Afiliado afiliado : afi.listarAfiliados()) {
            System.out.println("id: "+afiliado.getIdAfiliado());
            System.out.println("nombre: "+afiliado.getNombre());
            System.out.println("apellido: "+afiliado.getApellido());
            System.out.println("dni: "+afiliado.getDni());
            
            System.out.println("==============================");
    }
    
}
}
