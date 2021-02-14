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
        
        
        System.out.println(Gusuarios.toString());
    }
    
}
