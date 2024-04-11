package io.codelex.oop.summary.ordersAndInvoices;

import java.text.DecimalFormat;
import java.util.stream.IntStream;

public class Invoice {
    private final Order order;
    private final String invoiceNr;
    private InvoiceStatus invoiceStatus; // not final so send() can change status to SENT
    private final double vatRate = 0.21;

    public Invoice(Order order, String invoiceNr) {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Order is empty");
        }
        this.order = order;
        this.invoiceNr = invoiceNr;
        this.invoiceStatus = InvoiceStatus.APPROVED;
    }

    public void send() {
        invoiceStatus = InvoiceStatus.SENT;
    }

    /*
     * Calculates the total sum, VAT and total sum with VAT.
     * Formats the invoice content with white space padding and "=" symbols, appending to a stringBuilder.
     * Returns - formatted invoice as a string.
     * */
    public String formatedInvoice() {
        DecimalFormat df = new DecimalFormat("#0.00");
        StringBuilder resultString = new StringBuilder();
        double total = order.getItems().stream().mapToDouble(SellableThing::getPrice).sum();
        double vat = total * vatRate;
        double vatTotal = vat + total;

        resultString.append("===================================================\n");
        appendWithPadding(resultString, String.format("INVOICE NUMBER: %s", invoiceNr));
        appendWithPadding(resultString, String.format("STATUS: %s", invoiceStatus));
        // Using IntStream to iterate over the items and add them to the result string with numeration.
        IntStream.range(0, order.getItems().size()).forEach(i -> {
            appendWithPadding(resultString, String.format("%d. %s", i + 1, order.listItems().split("\n")[i]));
        });
        appendWithPadding(resultString, String.format("SUM: %s EUR", df.format(total)));
        appendWithPadding(resultString, String.format("VAT (21%%): %s EUR", df.format(vat)));
        appendWithPadding(resultString, String.format("TOTAL: %s EUR", df.format(vatTotal)));
        resultString.append("===================================================");

        return resultString.toString();
    }

    /*
     * Adds needed content to the stringBuilder and "=" symbols with specific white space count, calculated
     * by the width of the first "=" printed line and content length.
     * */
    private void appendWithPadding(StringBuilder strbuilder, String content) {
        int padding = 48 - content.length();
        strbuilder.append(String.format("= %s%" + padding + "s=\n", content, " "));
    }
}