/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomutual;

import java.time.LocalDate;
import proyectomutual.AccesoDatos.AfiliadoData;
import proyectomutual.AccesoDatos.EspecialidadData;
import proyectomutual.AccesoDatos.OrdenData;
import proyectomutual.AccesoDatos.PrestadorData;
import proyectomutual.entidades.Afiliado;
import proyectomutual.entidades.Especialidad;
import proyectomutual.entidades.Orden;
import proyectomutual.entidades.Prestador;

/**
 *
 * @author sonia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //VARIABLES DATA
        AfiliadoData afiData=new AfiliadoData();
        PrestadorData prestaData=new PrestadorData();
        OrdenData ordenData=new OrdenData();
        EspecialidadData espeData=new EspecialidadData();
        
        //BUSCA DATOS EN BASE A TRAVÉS DE MÉTODOS
        
        //Busca afiliado x ID afiliado y guarda en variable afiliado
        Afiliado afiliado=afiData.buscarAfiliado(1);
        
        //Busca Especialidad x ID especialidad y guarda en variable especialidad
        Especialidad especialidad=espeData.buscarEspecialidad(1);
        
        //Busca Prestador x ID prestador y guarda en variable prestador
        Prestador prestador=prestaData.buscarPrestador(1);
  
        //Guardar una nueva orden
        Orden orden=new Orden (LocalDate.of(2023, 06, 10), "efectivo", 2000.00, afiliado, prestador);
        ordenData.guardarOrden(orden);
    }
}
