package unit1;

import java.util.Scanner;

public class Unit1Task4 {



    public static void main(String[] args) {
        System.out.println("Определяем количество положительных чисел:");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите первое число:");
        int a = sc.nextInt();
        System.out.println("введите второе число:");
        int b = sc.nextInt();
        System.out.println("введите третье число:");
        int c = sc.nextInt();

        if (a>0 && b>0 && c>0)
            System.out.println ("Количество положительных чисел = 3");
        else if (a<=0 && b>0 && c>0)
            System.out.println ("Количество положительных чисел = 2");
        else if (a<=0 && b<=0 && c>0)
            System.out.println ("Количество положительных чисел = 1");
        else if (a<=0 && b<=0 && c<=0)
            System.out.println ("Количество положительных чисел = 0");
        else if (a>0 && b<=0 && c<=0)
            System.out.println ("Количество положительных чисел = 1");
        else if (a>0 && b>0 && c<=0)
            System.out.println ("Количество положительных чисел = 2");
        else if (a>0 && b<=0 && c>0)
            System.out.println ("Количество положительных чисел = 2");
        else if (a<=0 && b>0 && c<=0)
            System.out.println ("Количество положительных чисел = 2");
    }
}