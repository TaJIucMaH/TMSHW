package unit3;

import java.util.Arrays;
import java.util.Scanner;

//Ввести размерность массива с клавиатуры. Создать массив этого размера и заполнить случайными значениям.
//Вывести на экран все элементы в строчку через пробел.
public class Unit3Task0 {

    public static void main(String[] args) {
        System.out.println("Задайте размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] massiv = new int[n];

        for (int i = 0; i < massiv.length; i++)
            massiv[i] = (int) (-50 + (Math.random() * 100));

        for (int i : massiv) ;

        System.out.println(Arrays.toString(massiv));
    }
}
