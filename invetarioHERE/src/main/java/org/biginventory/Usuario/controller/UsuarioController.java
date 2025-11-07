package org.biginventory.Usuario.controller;

import org.biginventory.Usuario.model.entity.Usuario;
import org.biginventory.Usuario.model.repository.UsuarioRepositorio;
import org.biginventory.Usuario.view.UsuarioView;
import org.biginventory.item.model.repository.ItemRepository;
import org.biginventory.item.view.ItemView;

public class UsuarioController {

  private final UsuarioRepositorio usuarioRepositorio;
  private final UsuarioView usuarioView;

  public UsuarioController(UsuarioRepositorio usuarioRepositorio, UsuarioView usuarioView) {
    this.usuarioRepositorio = usuarioRepositorio;
    this.usuarioView = usuarioView;
  }

  public void crearUsuario() {


  }

  public void mostrarUsuario() {


  }
}
