package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private int batteryLevel;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, int batteryLevel) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() { // modified toString method to display all information as for computers
        return "Laptop{" +
                "processor = '" + getProcessor() + '\'' +
                ", ram = " + getRam() +
                ", graphicsCard = '" + getGraphicsCard() + '\'' +
                ", company = '" + getCompany() + '\'' +
                ", model = '" + getModel() + '\'' +
                "batteryLevel = " + batteryLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryLevel == laptop.batteryLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryLevel);
    }
}
