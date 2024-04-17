package io.codelex.JavaAdvancedTest.BankCards;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
