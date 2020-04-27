package chap3;

import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case"A":
                message = "Excellent job!";
                break;
            case"B":
                message = "Great job!";
                break;
            case"C":
                message = "Good job!";
                break;
            case"D":
                message = "Work work!";
                break;
            case"F":
                message = "dude, wtf";
                break;
            default:
                message = "Error.Invalid grade";
                break;

        }
          System.out.println(message);
    }
}
