package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){
//1.Kolko chasa raboti
        System.out.println("Enter the number of hours:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//2.Kolko mu se pplashta na chas
        System.out.println("Enter the rate:");
        double rate = scanner.nextDouble();
//3.Umnojenie na chasoveete po chasovata stavka
        double grosPay = hours*rate;
//4.Rezultat
        System.out.println("The employee's gross pay is :" + grosPay);


    }

}
