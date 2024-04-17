package io.codelex.oop.persons;

public class Customer extends Person {
    private String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = id;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setPurchaseCount(int purchases) {
        this.purchaseCount = purchases;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getCustomerId() + " (" + getPurchaseCount() + " purchases)";
    }
}
