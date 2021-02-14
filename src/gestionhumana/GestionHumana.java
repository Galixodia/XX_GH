package gestionhumana;

import gestionhumana.pojos.XxGhUsuarios;

/**
 *
 * @author 000329745
 */
public class GestionHumana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XxGhUsuarios Gusuarios = new XxGhUsuarios();
        Gusuarios.setXx_gh_usuarios_id(1);
        Gusuarios.setXx_gh_usuarios_nombre_com("Juan Camilo Villa");
        
        XxGhUsuarios Gusuarios2 = new XxGhUsuarios(2, "Xiomara Torrez");
        
        Calucladora c = new Calucladora();
        
        c.setA(10);
        c.setB(0);
        
        
                
//        System.out.println(c.validarZero(0));
        System.out.println(c.suma());
        System.out.println(c.dividir());
        System.out.println(Gusuarios.toString());
        System.out.println(Gusuarios2.toString());
    }
    
}
