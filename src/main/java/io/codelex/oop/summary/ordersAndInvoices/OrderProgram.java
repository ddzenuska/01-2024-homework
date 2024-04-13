package io.codelex.oop.summary.ordersAndInvoices;

public class OrderProgram {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new FoodItem("Cheese", 1.75, "19.04.2024"));
        order.addItem(new ElectronicsItem("TV", 455.00, 125));
        order.addItem(new HouseholdItem("Chair", 25.00, "white"));
        order.addItem(new HouseholdItem("Table", 100.89, "black wood"));

        order.addItem(new ItemPacking());

        Invoice invoice = new Invoice(order, "INV2024");
        invoice.send();
        System.out.println(invoice.formatedInvoice());

    }
}
