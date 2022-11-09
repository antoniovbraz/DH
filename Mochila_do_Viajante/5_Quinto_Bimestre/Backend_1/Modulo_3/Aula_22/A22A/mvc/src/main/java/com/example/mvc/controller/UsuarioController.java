package com.example.mvc.controller;

import com.example.mvc.model.Usuario;
import com.example.mvc.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public Usuario criarUsuario(){
        return usuarioService.criarUsuario("Antonio Henrique", 37);
    }
}
