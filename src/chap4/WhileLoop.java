package chap4;

import java.util.Scanner;

public class WhileLoop {
    public static  void main(String args []){

        int rate =15;
        int maxHours = 40;

        System.out.println("Kolko chasa sa bachkali?");
        Scanner scanner = new Scanner(System.in);
        double hourWorked = scanner.nextDouble();

         while(hourWorked > maxHours || hourWorked < 1){
             System.out.println("Invalid entry. Yours must be between 1 and 40");
             hourWorked = scanner.nextDouble();

         }
         scanner.close();

         double gross = rate * hourWorked;
         System.out.println("Gross pay: $" + gross);

    }
}
