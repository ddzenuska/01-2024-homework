package io.codelex.oop.summary.ordersAndInvoices;

public class OrderProgram {
    public static void main(String[] args) {
        FoodItem foodItem1 = new FoodItem("Cheese", 1.75, "19.04.2024");
        ElectronicsItem electItem1 = new ElectronicsItem("TV", 455.00, 125);
        HouseholdItem houseItem1 = new HouseholdItem("Chair", 25.00, "white");
        HouseholdItem houseItem2 = new HouseholdItem("Table", 100.89, "black wood");

        Order order = new Order();
        order.addItem(foodItem1);
        order.addItem(electItem1);
        order.addItem(houseItem1);
        order.addItem(houseItem2);

        Invoice invoice = new Invoice(order, "INV2024");
        System.out.println(invoice.formatedInvoice());
    }
}
