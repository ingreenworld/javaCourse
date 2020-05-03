package chap5;

import java.util.Scanner;

public class Chap5Homework {
    static Scanner scanner = new Scanner(System.in);
    static double chargefee = 0.25;
    static double taxPercent = 0.15;

    public static void main(String arg[]) {
        double planFee = inputPlanFee();
        double numOfMin = inputNumOfMins();
        scanner.close();
        double charge = calculateCharge(numOfMin);
        double calculateTax = calculateTax(planFee,charge);
        double total =total(calculateTax, charge, planFee);
        System.out.println("Your total is :" + total);

    }

    public static double inputPlanFee() {
        System.out.println("What it is your plan fee?");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    public static double inputNumOfMins() {
        System.out.println("What are the num of overPlan minutes?");
        double numOfMins = scanner.nextDouble();
        return numOfMins;
    }
    public static double calculateCharge(double numOfMin) {
        double charge = numOfMin*chargefee;
        return charge;
    }
    public static double calculateTax(double planFee, double charge) {
        double tax = (planFee + charge)*taxPercent;
        return tax;
    }
    public static double total(double tax, double charge, double planFee) {
        double total = tax + charge + planFee;
        return total;
    }
}

