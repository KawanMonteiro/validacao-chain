package com.projeto.validacao.controller;

import com.projeto.validacao.cadeia.CadeiaValidacao;
import com.projeto.validacao.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private final CadeiaValidacao cadeia;

    public UsuarioController(CadeiaValidacao cadeia) {
        this.cadeia = cadeia;
    }

    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody Usuario usuario) {
        cadeia.validar(usuario);
        return ResponseEntity.ok("Usuário válido: " + usuario.getNome());
    }
}
