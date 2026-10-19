package com.projeto.validacao.controller;

import com.projeto.validacao.exception.ValidacaoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErroHandler {

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity<String> tratar(ValidacaoException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
