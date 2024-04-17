package io.codelex.JavaAdvancedTest.BankCards;

public class DebitCard extends Card {
    public DebitCard(int cardNumber, String cardHolderName, String ccv, double balance) {
        super(cardNumber, cardHolderName, ccv, balance);
    }

    @Override
    public void addMoney(double amountToAdd) {
        super.addMoney(amountToAdd);
        if (this.balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }
}
