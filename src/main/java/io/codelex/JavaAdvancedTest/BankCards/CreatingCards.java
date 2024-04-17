package io.codelex.JavaAdvancedTest.BankCards;

public class CreatingCards {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard(123456789, "John Bleak", "821", 10041.10);
        CreditCard creditCard = new CreditCard(987654321, "David Kent", "932", 958.09);

        System.out.println("Debit card balance: " + debitCard.getBalance());
        System.out.println("Debit card balance: " + creditCard.getBalance());

        try {
            debitCard.addMoney(1000);
            debitCard.withdrawMoney(5000);
            creditCard.addMoney(1000);
            creditCard.withdrawMoney(500);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
