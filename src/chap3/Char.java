package chap3;

import java.util.Scanner;

/*

 */
public class Char {
    public static void main(String[] arg){
       System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        char grade ;

        if(score < 60){
            grade= 'F';
        }
        else if (score < 80){
            grade= 'D';
        }
        else if (score < 90){
            grade= 'C';
        }
        else{
            grade= 'A';
        }
        System.out.println("Your grade is " + grade);
    }
}
