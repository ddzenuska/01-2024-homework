package io.codelex.oop.imperialToMetric;

public enum ConversionType { // defined methods directly in the enum constants
    METERS_TO_YARDS {
        @Override
        public double convert(double value) {
            return value * 1.09361;
        }
    },
    YARDS_TO_METERS {
        @Override
        public double convert(double value) {
            return value / 1.09361;
        }
    },
    CENTIMETERS_TO_INCHES {
        @Override
        public double convert(double value) {
            return value / 2.54;
        }
    },
    INCHES_TO_CENTIMETERS {
        @Override
        public double convert(double value) {
            return value * 2.54;
        }
    },
    KILOMETERS_TO_MILES {
        @Override
        public double convert(double value) {
            return value / 1.609;
        }
    },
    MILES_TO_KILOMETERS {
        @Override
        public double convert(double value) {
            return value * 1.609;
        }
    };

    public abstract double convert(double value); /* each enum constant implements this abstract method for these
     direct enum method to work and be accessible as conversionType.convert().*/
}
