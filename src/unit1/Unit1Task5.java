package unit1;

import java.util.Scanner;

class Unit1Task5 {
    public static void main(String[] args) {
        System.out.println("Определяем количество положительных и отрицательных чисел:");
        Scanner Scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int A = Scan.nextInt();
        System.out.print("Введите второе число: ");
        int B = Scan.nextInt();
        System.out.print("Введите третье число: ");
        int C = Scan.nextInt();
        int pol = 0,otr = 0;

        if (A > 0) pol++;
        else if (A < 0)otr++;
        if (B > 0) pol++;
        else if (B < 0)otr++;
        if (C > 0) pol++;
        else if (C < 0)otr++;

        System.out.println("положительных чисел(>0) = "+pol);
        System.out.print("отрицательных чисел(<0) = "+otr);
    }
}