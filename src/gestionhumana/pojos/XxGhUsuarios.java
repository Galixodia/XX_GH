package gestionhumana.pojos;

import java.sql.Date;

/**
 *
 * @author 000329745
 */
public class XxGhUsuarios {
    
    private int xx_gh_usuarios_id;
    private String xx_gh_usuarios_tipo_doc;
    private String xx_gh_usuarios_num_doc;
    private String xx_gh_usuarios_nombre_com;
    private Date xx_gh_usuarios_fecha_nac;
    private int xx_gh_usuarios_activo = 1;
    private int xx_gh_usuarios_roles_id;

    public XxGhUsuarios() {
    }

    public XxGhUsuarios(int xx_gh_usuarios_id, String xx_gh_usuarios_nombre_com) {
        this.xx_gh_usuarios_id = xx_gh_usuarios_id;
        this.xx_gh_usuarios_nombre_com = xx_gh_usuarios_nombre_com;
    }

    public int getXx_gh_usuarios_id() {
        return xx_gh_usuarios_id;
    }

    public void setXx_gh_usuarios_id(int xx_gh_usuarios_id) {
        this.xx_gh_usuarios_id = xx_gh_usuarios_id;
    }

    public String getXx_gh_usuarios_tipo_doc() {
        return xx_gh_usuarios_tipo_doc;
    }

    public void setXx_gh_usuarios_tipo_doc(String xx_gh_usuarios_tipo_doc) {
        this.xx_gh_usuarios_tipo_doc = xx_gh_usuarios_tipo_doc;
    }

    public String getXx_gh_usuarios_num_doc() {
        return xx_gh_usuarios_num_doc;
    }

    public void setXx_gh_usuarios_num_doc(String xx_gh_usuarios_num_doc) {
        this.xx_gh_usuarios_num_doc = xx_gh_usuarios_num_doc;
    }

    public String getXx_gh_usuarios_nombre_com() {
        return xx_gh_usuarios_nombre_com;
    }

    public void setXx_gh_usuarios_nombre_com(String xx_gh_usuarios_nombre_com) {
        this.xx_gh_usuarios_nombre_com = xx_gh_usuarios_nombre_com;
    }

    public Date getXx_gh_usuarios_fecha_nac() {
        return xx_gh_usuarios_fecha_nac;
    }

    public void setXx_gh_usuarios_fecha_nac(Date xx_gh_usuarios_fecha_nac) {
        this.xx_gh_usuarios_fecha_nac = xx_gh_usuarios_fecha_nac;
    }

    public int getXx_gh_usuarios_activo() {
        return xx_gh_usuarios_activo;
    }

    public void setXx_gh_usuarios_activo(int xx_gh_usuarios_activo) {
        this.xx_gh_usuarios_activo = xx_gh_usuarios_activo;
    }

    public int getXx_gh_usuarios_roles_id() {
        return xx_gh_usuarios_roles_id;
    }

    public void setXx_gh_usuarios_roles_id(int xx_gh_usuarios_roles_id) {
        this.xx_gh_usuarios_roles_id = xx_gh_usuarios_roles_id;
    }

    @Override
    public String toString() {
        return "XxGhUsuarios{" + "xx_gh_usuarios_id=" + xx_gh_usuarios_id + ", xx_gh_usuarios_tipo_doc=" + xx_gh_usuarios_tipo_doc + ", xx_gh_usuarios_num_doc=" + xx_gh_usuarios_num_doc + ", xx_gh_usuarios_nombre_com=" + xx_gh_usuarios_nombre_com + ", xx_gh_usuarios_fecha_nac=" + xx_gh_usuarios_fecha_nac + ", xx_gh_usuarios_activo=" + xx_gh_usuarios_activo + ", xx_gh_usuarios_roles_id=" + xx_gh_usuarios_roles_id + '}';
    }


    
}
