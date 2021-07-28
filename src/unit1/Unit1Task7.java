package unit1;

import java.util.Scanner;

public class Unit1Task7 {

    public static void main(String[] args) {
        System.out.println("Выводим правильное окончание.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("введите количество программистов:");
            int a = sc.nextInt();
            int a1 = a % 10;
            int a2 = a % 100;

            if ((a1 == 0) || (a1 >= 5) && (a1 <= 9) || (a2 >= 11) && (a2 <= 19)) {
                System.out.println("программистов");
            } else if (a1 == 1) {
                System.out.println("программист");
            } else if ((a1 >= 2) && (a1 <= 4)) {
                System.out.println("программиста");
            }
        }
    }
}