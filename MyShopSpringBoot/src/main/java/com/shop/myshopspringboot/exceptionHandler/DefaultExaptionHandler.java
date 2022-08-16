package com.shop.myshopspringboot.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class DefaultExaptionHandler {
    Logger logger = LoggerFactory.getLogger(DefaultExaptionHandler.class);

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity emptyResult(Exception e) {
        logger.error(e.getMessage());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
