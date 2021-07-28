package unit1;

import java.util.Scanner;

public class Unit1Task1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int x;
        System.out.println("Please enter a number");
        x = reader.nextInt();
        if (x > 9 && x < 100) {
            System.out.println("положительное, двухзначное");
            main(args);
        } //продолжение
        else if (x < -9 && x > -100) {
                System.out.println("отрицательное, двухзначное");
                main(args); //продолжение
        } else if (x < 0 && x > -10) {
            System.out.println("отрицательное, однозначное");
            main(args);
        }//продолжение
        else if (x > 0 && x < 10) {
            System.out.println("положительное, однозначное");
            main(args); //продолжение
        } else if (x > 99 && x < 1000) {
            System.out.println("положительное, трехзначное");
            main(args);
        }//продолжение
        else if (x < -99 && x > -1000) {
            System.out.println("отрицательное, трехзначное");
            main(args); //продолжение
        } else {
            System.out.println(false);
            main(args); //продолжение
        }
    }
}