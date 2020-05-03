package chap5;

import java.util.Scanner;

public class ScopeHomework {
    static double baseIncome = 25000;
    static double baseScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {

        System.out.println("Hello! I'm instant credit check!");
        double income = getSalary();
        double creditScore = getCredit();
        scanner.close();
        boolean qualified =isUserQualified(income, creditScore);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("How much do you earn?");
        double income = scanner.nextDouble();
        return income;
    }

    public static double getCredit() {
        System.out.println("What is your credit score?");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }

    public static boolean isUserQualified(double income, double creditScore) {
        if (income > baseIncome && baseScore <= creditScore) {
            return true;
        } else {
            return false;
        }

    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congracts");
        }
        else {
            System.out.println("Nope");
        }
    }
}

