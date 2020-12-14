package com.cg.walletApp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.walletApp.exception.WalletException;

@ControllerAdvice
public class GlobalErrorHandler {
	
	@ExceptionHandler({WalletException.class})
	public ResponseEntity<String> handleError(Exception ex) {
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<String> handlerValidationErrors(MethodArgumentNotValidException ex){
        String msg="";
        List<FieldError> errors=ex.getBindingResult().getFieldErrors();
        for(FieldError fieldError:errors) {
            msg+=fieldError.getDefaultMessage()+"\n";
        }
        return new ResponseEntity<String>(msg, HttpStatus.CONFLICT);
    }

}
