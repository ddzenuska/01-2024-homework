package io.codelex.oop.summary.ordersAndInvoices;

public class WrongOrderException extends RuntimeException {
    public WrongOrderException(String message) {
        super(message);
    }
}
