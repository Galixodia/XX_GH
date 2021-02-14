/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhumana;

/**
 *
 * @author 000329745
 */
public class Calucladora {
    
    
    private int a,b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int dividir(){
        int c;
        if(validarZero(b)){
            return 0;
        }else{
            c = a /b;
        }
        
    return c;
    }
    
    private boolean validarZero(int numero){
    
        boolean resultado;
        
        if(numero == 0){
            resultado = true;
        }else{
            resultado = false;
        }
        
        return resultado;
    }
    
}
