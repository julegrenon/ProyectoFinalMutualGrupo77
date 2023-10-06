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
        
        
        Especialidad ES = new Especialidad("Futbolista");

        EspecialidadData ED = new EspecialidadData();
        
        ED.agregarEspecialidad(ES);
        
        
        PrestadorData PD = new PrestadorData();
        Prestador PR = new Prestador("Roman", "Riquelme", 12, 666, "La Boca", ES, true);


        PD.agregarPrestador(PR);

    }
}
