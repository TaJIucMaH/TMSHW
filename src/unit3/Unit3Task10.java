package unit3;
// Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n. Если пользователь
// ввёл не подходящее число, то программа должна выдать соответствующее сообщение. Создать массив
// из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только из
// чётных элементов первого массива, если они там есть, и вывести его на экран.
import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        int n = 0, j = 0;
        do {
            System.out.print("Ввдите число: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 3) {
                    int[] mas1 = new int[n];
                    for (int i = 0; i < mas1.length; i++) {  //for (int k : mas1) {
                        Random rand = new Random();
                        mas1[i] = rand.nextInt(n);
                        System.out.print(mas1[i] + " ");
                        if (mas1[i] % 2 == 0) {
                            j++;
                        }

                    }
                    System.out.println("\n");
                    if (j != 0) {
                        int[] mas2 = new int[j];
                        j = 0;
                        for (int k : mas1) {
                            if (k % 2 == 0) {
                                mas2[j] = k;
                                System.out.print(mas2[j] + " ");
                                j++;
                            }
                        }
                    } else {
                        System.out.println("Чётных значений нет");
                    }
                }
            }
        } while (n <= 3);
    }}
