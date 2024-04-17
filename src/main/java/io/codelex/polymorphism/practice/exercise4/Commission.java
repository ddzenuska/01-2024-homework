package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double pay() {
        double pay = super.pay() + (totalSales * commissionRate);
        totalSales = 0;
        return pay;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked + ". Total sales: " + totalSales;
        return result;
    }
}
