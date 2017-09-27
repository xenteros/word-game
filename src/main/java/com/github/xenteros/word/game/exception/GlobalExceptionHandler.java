package com.github.xenteros.word.game.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by agurgul on 27.09.2017.
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(GameNotFoundException.class)
    @ResponseBody
    public ResponseEntity<String> RunTimeException(RuntimeException e) {
        return new ResponseEntity<>("Nie udało się dołączyć do gry", HttpStatus.BAD_REQUEST);
    }
}
