package unit1;

import java.util.Scanner;

public class Unit1Task6 {

    public static void main(String[] args) {
        System.out.println("Какое число больше?");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите первое число:");
        int a = sc.nextInt();
        System.out.println("введите второе число:");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Число а больше b");
        if (a == b)
            System.out.println("Число а = b");
        else
            System.out.println("Число b больше а");

    }
}
