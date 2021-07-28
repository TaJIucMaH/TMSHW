package unit1;

import java.util.Scanner;

public class Unit1Task2
{
    public static void main (String[] args) {
        System.out.println("Существует ли треугольник?");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер первой стороны:");
        int a = sc.nextInt();
        System.out.println("введите размер второй стороны:");
        int b = sc.nextInt();
        System.out.println("введите размер третьей стороны:");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Треугольник существует!");
        main(args);}
        else {
            System.out.println("Треугольник не существует!!!");
            main(args);
        }
    }
}