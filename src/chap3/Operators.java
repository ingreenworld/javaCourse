package chap3;

import java.util.Scanner;

/*
Klalifikacia za kredit = pone na 30k
i da bachka tam ot pone 2 godini
 */
public class Operators {
    public static void main(String[] args) {
        int minimumPaid = 30000;
        int minimumWork = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you earn?");
        double income = scanner.nextInt();

        System.out.println("From how long do you work here?");
        double workYears = scanner.nextInt();

        if (minimumPaid <= income && minimumWork <= workYears) {
            System.out.println("Ok, you got the loan");
        } else {
            System.out.println("Sorry, you must earn at least $" + minimumPaid + " to qualify for the loan");
        }

    }
}
