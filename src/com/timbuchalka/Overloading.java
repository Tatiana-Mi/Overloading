package com.timbuchalka;

public class Overloading {

    public static void main(String[] args) {
        int newScore = calculateScore();
        System.out.println("New score is " + newScore);
        calculateScore();
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    private static int calculateScore() {
        return -1;
    }


    public static double calcFeetAndInchesToCentimeters(double Feet, double Inches) {
        if ((Feet < 0) || ((Inches < 0) || (Inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (Feet * 12) * 2.54;
        centimeters += Inches * 2.54;
        System.out.println(Feet + " feet, " + Inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double Inches) {
        if (Inches < 0) {
            return -1;
        }
        double Feet = (int) Inches / 12;
        double remainingInches = (int) Inches % 12;
        System.out.println(Inches + " inches is equal to " + Feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(Feet, remainingInches);
    }
}


