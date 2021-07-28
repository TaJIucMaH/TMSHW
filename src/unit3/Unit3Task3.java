package unit3;

import java.util.Random;

//Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class Unit3Task3 {
    public static void main(String[] args) {

        int b=0;
        int [] mass = new int [15];
        for (int i=0; i<mass.length; i++){
            Random rand = new Random();
            mass[i] = rand.nextInt(99);
            System.out.print(mass[i] + " ");

        if ((mass[i]>0) & (mass[i]%2==0))b++;
        }
        System.out.println(" ");
        System.out.println("всего в массиве " + b + " четных");

}}
