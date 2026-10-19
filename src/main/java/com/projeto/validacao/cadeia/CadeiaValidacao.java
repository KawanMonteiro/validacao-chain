package com.projeto.validacao.cadeia;

import com.projeto.validacao.model.Usuario;
import com.projeto.validacao.validador.Validador;

public class CadeiaValidacao {

    private final Validador primeiro;

    public CadeiaValidacao(Validador primeiro) {
        this.primeiro = primeiro;
    }

    public void validar(Usuario usuario) {
        primeiro.validar(usuario);
    }
}
