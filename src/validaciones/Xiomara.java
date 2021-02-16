/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

/**
 *
 * @author 000329745
 */
public class Xiomara {
    
    //Xiomara obj = new Xiomara();
    
    
    //Eliminar saltos de linea
    
    public String eliminarSaltoLinea(String a){
        
        String result = a.replace("\n", "");
                
        return result;
    }

    /**
     * Elimina el espacio vacio al inicio de un String
     * @param str String 
     * @return String
     * @since 14/02/2021
     */
    public String eliminarEspacioInicial (String str){
        if(str.substring(0,1).equalsIgnoreCase(" ")){
            str = str.substring(1, str.length());
            return str;
        }else{
            return str;
        }
    }

    /**
     * Eliminar todos los espacios vacíos al inicio de un String
     * @param str String 
     * @return String
     * @since 15/02/2021
     */  
    /*
        Quitar varios espacios al inicial  
        Recorrer el parámetro desde la primera posición hasta que sea diferente de vacio
            ¿parámetro(Xposición) es  = ""
                parámetro = parámetro.eliminarEspacioInicial 
        Retornar el parámetro sin espacios al principio
    */
    public String eliminarVariosEspaciosIniciales (String str){
        Xiomara obj = new Xiomara();
        while(str.substring(0,1).equalsIgnoreCase(" "))
        {
            str = obj.eliminarEspacioInicial(str);
            //System.out.println("Entró al ciclo");
            //str = "false";
        }
        return str;
    }
    
    /**
     * Elimina el espacio vacio al final de un String
     * @param str String 
     * @return String
     * @since 14/02/2021
     */
    
    /*
    
    */

}
