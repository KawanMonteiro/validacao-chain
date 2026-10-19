package com.projeto.validacao.validador;

import com.projeto.validacao.exception.ValidacaoException;
import com.projeto.validacao.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class ValidadorEmail extends  ValidadorBase {

    private static final String REGEX = "^[\\w.+-]+@[\\w-]+\\.[\\w.]+$";

    @Override
    public void validar(Usuario usuario) {
        String email = usuario.getEmail();

        if (email == null || email.isBlank()) {
            throw new ValidacaoException("Email é obrigatório");
        }
        if (!email.matches(REGEX)) {
            throw new ValidacaoException("Email inválido");
        }

        chamarProximo(usuario);
    }
}
