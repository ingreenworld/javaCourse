package chap5;

import java.util.Scanner;

public class Methods {
    public static void main(String[] agrs) {

        System.out.println("Hello stranger, tell me your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greet(name);
    }
    public static void greet(String name){
        System.out.println("Now you are not stranger! Hello " + name + " !");

    }

}
