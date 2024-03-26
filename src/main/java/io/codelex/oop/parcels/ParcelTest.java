package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel parcelOne = new Parcel(31, 30, 56, 14f, true);
        parcelOne.validate();
        System.out.println(parcelOne);
    }
}
