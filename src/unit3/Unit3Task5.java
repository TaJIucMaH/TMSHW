package unit3;

import java.util.Random;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, выведите массивы на экран в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и сообщите, для кого из массивов это значение оказалось больше
// (либо сообщите, что их среднее арифметическое равны.
public class Unit3Task5 {

    public static void main(String[] args) {
        int[] mas1 = new int[5], mas2 = new int[5];
        int s1, s2;
        double a1, a2;
        s1 = 0;
        s2 = 0;
        for (int i = 0; i < mas1.length; i++) {
            Random rand = new Random();
            mas1[i] = rand.nextInt(15);
            mas2[i] = rand.nextInt(15);
        }
        for (int j : mas1) {   //for (int i = 0; i < mas1.length; i++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
        for (int i = 0; i < mas1.length; i++) {
            s1 = s1 + mas1[i];
        }
        for (int i = 0; i < mas2.length; i++) {
            s2 = s2 + mas2[i];
        }
        System.out.println();
        a1 = (double) s1 /mas1.length;
        a2 = (double) s2 /mas1.length;
        if (a1 < a2) {
            System.out.println("Среднее арифм. 1-го массива больше среднего арифм. 2-го массива");
        } else if (a2 < a1) {
            System.out.println("Среднее арифм. 2-го массива больше среднего арифм. 1-го массива");
        } else {
            System.out.println("Среднее арифм. 1-го и 2-го массивов равны");
        }
    }
}



