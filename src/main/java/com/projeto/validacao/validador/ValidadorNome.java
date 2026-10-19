package com.projeto.validacao.validador;

import com.projeto.validacao.exception.ValidacaoException;
import com.projeto.validacao.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class ValidadorNome extends ValidadorBase {

    @Override
    public void validar(Usuario usuario) {
        String nome = usuario.getNome();

        if (nome == null || nome.isBlank()) {
            throw new ValidacaoException("Nome é obrigatório");
        }
        if (nome.trim().length() < 3) {
            throw new ValidacaoException("Nome deve ter ao menos 3 caracteres");
        }

        chamarProximo(usuario);
    }
}
