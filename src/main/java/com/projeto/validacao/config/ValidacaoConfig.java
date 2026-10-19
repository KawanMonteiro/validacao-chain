package com.projeto.validacao.config;

import com.projeto.validacao.cadeia.CadeiaValidacao;
import com.projeto.validacao.validador.ValidadorEmail;
import com.projeto.validacao.validador.ValidadorNome;
import com.projeto.validacao.validador.ValidadorSenha;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidacaoConfig {

    @Bean
    public CadeiaValidacao cadeiaValidacao(ValidadorNome nome, ValidadorEmail email, ValidadorSenha senha) {
        nome.setProximo(email);
        email.setProximo(senha);

        return new CadeiaValidacao(nome);
    }
}
