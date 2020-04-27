package chap3;

import java.util.Scanner;

public class IfElse {
    /*
    Bi trqbvalo da pravqt 10 sale-a na sedmica
    za tezi koito pravqt poluchavat pozdravitelno suobshtenie
    za tezi koito nqmat, im izliza suobshtenie kolko ne sa im dostignali
     */
    public static  void main(String args[]) {

        int qoata = 10;

        System.out.println("How many sales?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > qoata) {
            System.out.println("Good Job");
        }
        else if (sales < qoata ){
            System.out.println("You need more " + (qoata-sales));
        }
    }
}
