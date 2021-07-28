package unit1;

import java.util.Scanner;

public class Unit1Task3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x;
        x = reader.nextInt();
        if (x > 0) {
            System.out.println("если число положительное, то прибавляем к нему 1, х=" + (x += 1));
            main(args);}
        else if (x < 0) {
            System.out.println("если число отрицательное, то отнимаем от него 2, х=" + (x -= 2));
            main(args);}
        else if (x == 0){
            System.out.println("если число равно 0, то меняем его на 10, х=" + (x=10));
            main(args);}
        }
    }

