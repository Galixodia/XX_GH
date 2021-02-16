package gestionhumana;

import gestionhumana.pojos.XxGhUsuarios;
import validaciones.Camilo;
import validaciones.Xiomara;

/**
 *
 * @author 000329745
 */
public class GestionHumana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //###########################################CAMILO
        Camilo c = new Camilo();
        //System.out.println(c.validarZero(0));
        
        
        //#################################################
        
        //###########################################XIOMI
        Xiomara x = new Xiomara();
        System.out.println(x.eliminarSaltoLinea("xiomara\n" + "torrez"));
        System.out.println(x.eliminarEspacioInicial(" a b "));
        System.out.println(x.eliminarVariosEspaciosIniciales("   1 2"));

        
        //#################################################
        
        
        /*
        
        METODOS A IMPLEMENTAR
        ___________________________________________        
        
        
        X   Eliminar saltos de linea
        C   Eliminar Tabuladores
        X   Eliminar espacios al incio o final de un String
        C   Poner todo en minuscula
        X   Poner todo en mayuscula
        C   Valdiar si un String es nulo
        X   Validar si un numero es negativo
        C   Validar si una lista esta vacia
        C   Validar conexion base de datos
        X   Validar conexion con un servidor
        X   Validar lonqitu de un String
        C   validar la eistencia de un archivo en una ruta
        
        
        
        */
    }
    
}
