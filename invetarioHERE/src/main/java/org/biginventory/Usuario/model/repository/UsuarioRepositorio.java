package org.biginventory.Usuario.model.repository;

import org.biginventory.Usuario.model.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {

    private List<Usuario> usuarioList = new ArrayList<>();

    public void addUsuario(Usuario usuario){
        this.usuarioList.add(usuario);
    }
    public void deleteUsuario(String id){
        for(Usuario usuario : usuarioList){
            if(usuario.getDni().equals(usuario)){
                this.usuarioList.remove(usuario);
                return;
            }
            System.out.println("No esta");
        }
    }

    public boolean validacion(String email ){
        for(Usuario usuario : usuarioList){
            if(usuario.getEmail().equalsIgnoreCase(email)){
                return true;
            }
        }
        return false;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
}
