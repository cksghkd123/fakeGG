package com.BDFH.fakeGG.exception;

public class NotFoundPostsException extends RuntimeException{

    public NotFoundPostsException() {
    }

    public NotFoundPostsException(String message) {
        super(message);
    }

    public NotFoundPostsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundPostsException(Throwable cause) {
        super(cause);
    }

    public NotFoundPostsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
