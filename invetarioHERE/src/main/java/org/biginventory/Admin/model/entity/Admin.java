package org.biginventory.Admin.model.entity;

import org.biginventory.Usuario.model.entity.Usuario;
import org.biginventory.Usuario.view.UsuarioView;

public class Admin extends Usuario {

    private String usuario;

    private String contrasena;



    public Admin(String dni, String nombre, String apellido, String email, int telefono) {
        super(dni, nombre, apellido, email, telefono);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }



}
