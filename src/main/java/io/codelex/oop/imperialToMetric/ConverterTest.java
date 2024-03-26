package io.codelex.oop.imperialToMetric;

import java.text.DecimalFormat;

public class ConverterTest {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        MeasurementConverter converter = new MeasurementConverter();

        double kmToMiles = converter.converter(1000, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(df.format(kmToMiles));
        double milesToKm = converter.converter(3272, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(df.format(milesToKm));

        double cmToInches = converter.converter(78.9, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(df.format(cmToInches));
        double inchToCm = converter.converter(20, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(df.format(inchToCm));

        double mToYards = converter.converter(489, ConversionType.METERS_TO_YARDS);
        System.out.println(df.format(mToYards));
        double yardsToMeters = converter.converter(271.2, ConversionType.YARDS_TO_METERS);
        System.out.println(df.format(yardsToMeters));
    }
}
