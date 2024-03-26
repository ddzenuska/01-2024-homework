package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int yLength;
    private int zLength;
    private int xLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int yLength, int zLength, int xLength, float weight, boolean isExpress) {
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.xLength = xLength;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (yLength + xLength + zLength > 300) {
            System.out.println("Size exceeds 300!");
            return false;
        }
        if (yLength < 30 || xLength < 30 || zLength < 30) {
            System.out.println("Each dimension shouldn't be below 30!");
            return false;
        }
        float weightLimit = isExpress ? 15.0f : 30.0f;
        if (weight > weightLimit) {
            System.out.println("Weight exceeds " + weightLimit + "!");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parcel {" +
                "yLength = " + yLength +
                ", zLength = " + zLength +
                ", xLength = " + xLength +
                ", weight = " + weight +
                ", isExpress = " + isExpress +
                '}';
    }
}
