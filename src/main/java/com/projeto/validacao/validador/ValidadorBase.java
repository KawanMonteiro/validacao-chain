package com.projeto.validacao.validador;

import com.projeto.validacao.model.Usuario;

public abstract class ValidadorBase implements Validador {

    protected  Validador proximo;

    @Override
    public void setProximo(Validador proximo) {
        this.proximo = proximo;
    }

    protected void chamarProximo(Usuario usuario) {
        if (proximo != null) {
            proximo.validar(usuario);
        }
    }
}
