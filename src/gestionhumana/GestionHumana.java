package gestionhumana;

import gestionhumana.pojos.XxGhUsuarios;
import java.util.ArrayList;
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
        System.out.println("Validacion de cero  :  "+c.validarZero(0));
        System.out.println("Cambio a Minusculas :  "+c.minusculas("JUAN CAMILO VILLA P"));
        System.out.println("Validacion tabs     :  "+c.eliminarTabs("prueba	tab	si"));
        String str= null;
        ArrayList<String> array = new ArrayList<>();
        //String resultado = c.esNuloVacio(array);
        System.out.println("Cambio a nuloovacio :  "+c.esNuloVacio(str));
        //System.out.println("Cambio a nuloovacio :  "+c.esNuloVacio(array));
        System.out.println("-------------------------------------");
        System.out.println(c.eliminarEspaciosIniciales("          a b "));
        
        
        //#################################################
        
        //###########################################XIOMI
        Xiomara x = new Xiomara();
        
        
        //#################################################
        
        
        /*
        
        METODOS A IMPLEMENTAR
        ___________________________________________        
        
        --C   Validar si es Zero
        X   Eliminar saltos de linea
        --C   Eliminar Tabuladores
        X   Eliminar espacios al incio o final de un String
        --C   Poner todo en minuscula
        X   Poner todo en mayuscula
        --C   Valdiar si un String es nulo
        X   Validar si un numero es negativo
        C   Validar si una lista esta vacia
        C   Validar conexion base de datos
        X   Validar conexion con un servidor
        X   Validar lonqitu de un String
        C   validar la eistencia de un archivo en una ruta
        
        
        
        */
    }
    
}
