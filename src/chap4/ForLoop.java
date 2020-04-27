package chap4;

import java.util.Scanner;

public class ForLoop {
    public static  void main(String args []) {


        System.out.println("Enter the number of items, please");
        Scanner scanner = new Scanner(System.in);
        int itemsNum = scanner.nextInt();

        double total = 0;
        for(int i=0; i<itemsNum; i++){

            System.out.println("Enter cost");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is: " + total);
    }

}
