package chap3;

import java.util.Scanner;

/*
vsichki vzimat 1000
if ima poveche ot 10 sale-a poluchava bonus 250
 */
public class SalaryCalculator {
    public static void main(String args[]){

        //
        int salary = 1000;
        int bonus = 250;
        int qoate = 10;

        //
        System.out.println("How many sales?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //
        if(sales > qoate){
            salary = salary + bonus;
        }
        else if (sales < 10){
            salary = salary;
        }
        System.out.println("The employee's pay is $ " + salary);
    }
}
