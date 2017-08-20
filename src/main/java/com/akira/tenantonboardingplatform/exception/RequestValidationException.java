package com.akira.tenantonboardingplatform.exception;

public class RequestValidationException extends RuntimeException{

    private static final long serialVersionUID = 4050998199540169704L;

    public RequestValidationException(Throwable t) {
        super(t);
    }

    public RequestValidationException(String message) {
        super(message);
    }

    public RequestValidationException(String message, Throwable t) {
        super(message, t);
    }
}
