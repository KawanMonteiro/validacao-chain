package com.projeto.validacao.validador;

import com.projeto.validacao.exception.ValidacaoException;
import com.projeto.validacao.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class ValidadorSenha extends ValidadorBase {

    @Override
    public void validar(Usuario usuario) {
        String senha = usuario.getSenha();

        if (senha == null || senha.isBlank()) {
            throw new ValidacaoException("Senha é obrigatória");
        }
        if (senha.length() < 8) {
            throw new ValidacaoException("Senha deve ter ao menos 8 caracteres");
        }
        if (!senha.matches(".*\\d.*")) {
            throw new ValidacaoException("Senha deve conter ao menos um número");
        }

        chamarProximo(usuario);
    }
}
