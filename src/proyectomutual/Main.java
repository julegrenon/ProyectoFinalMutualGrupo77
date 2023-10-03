/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual;

import java.time.LocalDate;
import proyectomutual.AccesoDatos.AfiliadoData;
import proyectomutual.AccesoDatos.Conexion;
import proyectomutual.AccesoDatos.EspecialidadData;
import proyectomutual.AccesoDatos.OrdenData;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Orden;
import proyectomutual.entidades.Prestador;

/**
 *
 * @author sonia
 */
public class Main {

    public static void main(String[] args) {

       // Connection conex= Conexion.getConexion();
       
       Especialidad esp = new Especialidad("Dermatologo");
      // EspecialidadData espData= new EspecialidadData();     
        Afiliado afil= new Afiliado("Paola", "Ramirez", 39273491, 154832912, "Las Heras 304", true);
       AfiliadoData afiData= new AfiliadoData();
       
       Prestador presta= new Prestador("Julio", 23427111, "San Martin 545", 4435221, esp, true);
        
        Orden orden= new Orden(LocalDate.of(2023,10,02), "debito",35000.0, afil, presta);
        OrdenData md=new OrdenData();
        md.guardarOrden(orden);
    }
}
