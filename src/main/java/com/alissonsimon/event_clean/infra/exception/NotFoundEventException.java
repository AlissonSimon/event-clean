package com.alissonsimon.event_clean.infra.exception;

public class NotFoundEventException extends RuntimeException {
    public NotFoundEventException(String message) {
        super(message);
    }
}
