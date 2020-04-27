package chapter2;

import java.util.Scanner;

public class HomeworkChap2 {

    public static void main(String arg[]) {

        System.out.println("What day of the year by words?");
        Scanner scanner = new Scanner(System.in);
        String adj = scanner.next();

        System.out.println("Whole number, please");
        int number = scanner.nextInt();

        System.out.println("Season?");
        String season = scanner.next();

        System.out.println("On a " + adj + " "+ season + " I drink a minumum of " + number + " cups of tea.");

    }


}
