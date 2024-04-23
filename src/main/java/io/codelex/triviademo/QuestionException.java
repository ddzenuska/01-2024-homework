package io.codelex.triviademo;

public class QuestionException extends RuntimeException {
    public QuestionException(String message, Throwable cause) {
        super(message, cause);
    }
}