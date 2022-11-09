package com.example.mvc.service;

import com.example.mvc.model.Usuario;

public class UsuarioService {

    public Usuario criarUsuario(String nome, int idade){
        Usuario usuario = new Usuario(nome,idade);
        return usuario;
    }
}
