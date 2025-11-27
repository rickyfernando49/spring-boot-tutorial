package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    public <T> NotFoundException(Class<T> entityClass, Object id) {
        super(buildMessage(entityClass, id));
    }

    private static String buildMessage(Class<?> entityClass, Object id) {
        String simpleName = entityClass.getSimpleName();
        return simpleName + " not found with id: " + id;
    }
}