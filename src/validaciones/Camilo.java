package validaciones;

import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author 000329745
 */
public class Camilo {
    
    //Metodo que valida si un numero es cero o no 
    //Retorna Bolleano
    public boolean validarZero(int numero){
        if(numero == 0){
            return true;
        }else{
            return false;
        }
    }
    
    
    //Metodo que tranforma toda una Cadena en minusulas
    //Retorna String
    public String minusculas(String cadena){
        
        return cadena.toLowerCase(Locale.ITALY);
    }
    
    //Metdo que valdia si un String es nulo o vacio
    //Boolean
    public boolean esNuloVacio(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
    
    //Metodo que elimina los Tab de una cadena
    //Retona String
    public String eliminarTabs(String cadena){
        return cadena.replace("\t", "");
    }
    
    
    //Metodo que valida si una lista esta vacia
    //Retorna Boolean
    public Boolean esNuloVacio(ArrayList<Object> array ){
        if(array != null && !array.isEmpty())
            return false;
        return true;
    }

    //Metodo que elimine los espacios del inico y find e un tring
    //Retorna String
    private String eliminarEspacioInicial(String str){
            
        if(str.substring(0, 1).equalsIgnoreCase(" ")){
           return str.substring(1, str.length());
        }else {
            return str;
        }
    }
    
    public String eliminarEspaciosIniciales(String str){
            
        while(str.substring(0, 1).equalsIgnoreCase(" ")){
            str = eliminarEspacioInicial(str);
        }
        return str;
    }
    
    //" a b "
    /*
        paramos cuando no encuentre vacio
            cuendo encuentre vacio
                lo quitamos
            paramos
    
        x = 3 + z;
        x = ( e + z );
        x = ((x / t) + 3) y;
        c = (x / t) + 3;
        x = ( x );
    
    
        me dan una cadena
        entrego una cadena
        
        sacar el primer caracter
        validar que sea espacio
            si es espacio entocnes retorno la cadena menos el primer caracter
        retorno la misma cadena
    
    */
    
    
}
