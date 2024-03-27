package io.codelex.oop.computers;

public class ComputerTest {
    public static void main(String[] args) {
        // Computers
        Computer dellComp1 = new Computer("Intel Core i9", 32,
                "Nvidia GeForce RTX 4080", "Dell", "Alienware Aurora R16");
        Computer appleComp1 = new Computer("M3", 8, "M3", "Apple", "iMac M3");
        Computer lenovoComp1 = new Computer("Intel Core i5", 8, "Intel UHD", "Lenovo", "ThinkPad");
        Computer hpComp1 = new Computer("Intel Core i5", 8, "Intel UHD", "HP", "G4");
        Computer dellComp2 = new Computer("Intel Core i9", 32,
                "Nvidia GeForce RTX 4080", "Dell", "Alienware Aurora R16");

        // printing properties of dell1
        System.out.println(dellComp1.getProcessor());
        System.out.println(dellComp1.getRam());
        System.out.println(dellComp1.getGraphicsCard());
        System.out.println(dellComp1.getCompany());
        System.out.println(dellComp1.getModel() + "\n");

        // printing computers
        System.out.println(dellComp1);
        System.out.println(appleComp1);
        System.out.println(lenovoComp1);
        System.out.println(hpComp1 + "\n");

        // comparing computer objects
        System.out.println(dellComp1.equals(appleComp1));
        System.out.println(dellComp1.equals(dellComp2));


        // Laptops
        Laptop appleLap1 = new Laptop("M2 Pro", 16, "M2 Pro", "Apple", "MacBook M2 Pro", 98);
        Laptop lenovoLap1 = new Laptop("Intel Core i7", 8, "Intel UHD", "Lenovo", "T480s", 45);
        Laptop lenovoLap2 = new Laptop("Intel Core i5", 8, "Intel UHD", "Lenovo", "T480s", 59);

        // Calling computer methods on Laptops
        System.out.println("\n" + appleLap1.getGraphicsCard());
        System.out.println(appleLap1.getCompany());
        System.out.println(appleLap1.getRam());
        System.out.println(appleLap1.getGraphicsCard() + "\n");

        System.out.println(appleLap1.getBatteryLevel());
        appleLap1.setBatteryLevel(70);
        System.out.println(appleLap1.getBatteryLevel());

        System.out.println(lenovoLap1.equals(lenovoLap2));

        System.out.println(appleLap1);
        System.out.println(lenovoLap1);
        System.out.println(lenovoLap2);
    }
}
