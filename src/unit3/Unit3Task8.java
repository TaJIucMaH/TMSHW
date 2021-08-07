package unit3;
//Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
// к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке),
// затем вывести количество целых элементов в третьем массиве.

import java.util.Random;

public class Unit3Task8 {
    public static void main(String[] args) {
        int[] mas1 = new int[10], mas2 = new int[10];
        double[] mas3 = new double[10];
        int j;
        j = 0;
        for (int i = 0; i < mas1.length; i++) {
            Random rand1 = new Random();
            mas1[i] = rand1.nextInt(30);   // mas1[i]=(int)(Math.random()*29+1);
            Random rand2 = new Random();
            mas2[i] = rand2.nextInt(10);   //  mas2[i]=(int)(Math.random()*9+1);


            mas3[i] = (double) mas1[i] / mas2[i];
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + "; ");
            if (mas3[i] % 1 == 0) {
                j++;
            }
        }
        System.out.println("\n Количество целых элементов в 3-м массиве = " + j);
    }
}
