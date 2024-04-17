package io.codelex.JavaAdvancedTest.BankCards;

public class CreditCard extends Card {
    public CreditCard(int cardNumber, String cardHolderName, String ccv, double balance) {
        super(cardNumber, cardHolderName, ccv, balance);
    }

    @Override
    public void withdrawMoney(double amountToWithdraw) {
        this.balance -= amountToWithdraw;
        if (this.balance < 100) {
            System.out.println("Warning: Low funds");
        }
    }
}
