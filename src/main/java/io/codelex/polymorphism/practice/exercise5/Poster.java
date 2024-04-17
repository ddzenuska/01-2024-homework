package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    public int length;
    public int width;
    public int copies;
    public int costPerCopy;

    public Poster(int fee, int length, int width, int copies, int costPerCopy) {
        super(fee);
        this.length = length;
        this.width = width;
        this.copies = copies;
        this.costPerCopy = costPerCopy;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getCostPerCopy() {
        return costPerCopy;
    }

    public void setCostPerCopy(int costPerCopy) {
        this.costPerCopy = costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() +
                " -> Poster: dimensions = " + width + "x" + length +
                ", copies = " + copies +
                ", cost per copy = " + costPerCopy +
                ", fee = " + fee;
    }
}
