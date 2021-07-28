package unit3;
//Создайте массив из 12 случайных целых чисел из отрезка [0;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

import java.util.Random;

public class Unit3Task7 {

    public static void main(String[] args) {

        int[] mas = new int[12];
        int max = 0, j = 0;
        for (int i = 0; i < mas.length; i++) {
            Random rand = new Random();
            mas[i] = rand.nextInt(15);
            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= max) {
                max = mas[i];
                j = i;
            }
        }
        System.out.println("\nМаксимальный элемент массива " + mas[j]);
        System.out.println("Индекс его последнего вхождения - " + j);
    }
}
