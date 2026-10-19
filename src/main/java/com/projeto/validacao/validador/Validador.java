package com.projeto.validacao.validador;

import com.projeto.validacao.model.Usuario;

public interface Validador {

    void validar(Usuario usuario);

    void setProximo(Validador proximo);
}
