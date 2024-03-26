package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public double converter(double value, ConversionType conversionType) {
        return switch (conversionType) { // for the input conversionType switch statement returns the according one with the value to convert.
            case METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_INCHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS ->
                    conversionType.convert(value);
        };
    }
}
