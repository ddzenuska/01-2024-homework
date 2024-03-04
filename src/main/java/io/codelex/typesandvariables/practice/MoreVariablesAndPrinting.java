package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;
public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String PersName, PersEyeColor, PersTeethColor, PersHairColor;
        int PersAge, PersHeightInch, PersWeightLbs;
        double WeightInKg, HeightInCm;

        DecimalFormat df = new DecimalFormat("0.00");

        PersName = "Zed A. Shaw";
        PersAge = 35;
        PersHeightInch = 74;  //height in inches
        PersWeightLbs = 180; // weight in lbs
        HeightInCm = PersHeightInch * 2.54;  // converting height in centimeters
        WeightInKg = PersWeightLbs * 0.453592; // converting weight in kilograms
        PersEyeColor = "blue";
        PersTeethColor = "white";
        PersHairColor = "brown";

        System.out.println("Let's talk about " + PersName + ".");
        System.out.println("He's " + PersHeightInch + " inches tall, which in metrics is " + df.format(HeightInCm) + " centimeters.");
        System.out.println("He's " + PersWeightLbs + " pounds heavy or " + df.format(WeightInKg) + " kilograms.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + PersEyeColor + " eyes and " + PersHairColor + " hair.");
        System.out.println("His teeth are usually " + PersTeethColor + " depending on the coffee.");

        System.out.println("If I add " + PersAge + ", " + PersHeightInch + ", and " + PersWeightLbs
                + " I get " + (PersAge + PersHeightInch + PersWeightLbs) + ".");
    }
}