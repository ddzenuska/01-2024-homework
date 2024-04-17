package io.codelex.JavaAdvancedTest.BankCards;

public abstract class Card {
    protected int cardNumber;
    protected String cardHolderName;
    protected String ccv;
    protected double balance;

    protected Card(int cardNumber, String cardHolderName, String ccv, double balance) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.ccv = ccv;
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addMoney(double amountToAdd) {
        this.balance += amountToAdd;
    }

    public void withdrawMoney(double amountToWithdraw) throws NotEnoughMoneyException {
        if (this.balance < amountToWithdraw) {
            throw new NotEnoughMoneyException("Not enough money on your account");
        }
        this.balance -= amountToWithdraw;
    }
}
