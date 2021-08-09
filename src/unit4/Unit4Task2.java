package unit4;

import java.util.Random;
import java.util.Scanner;

//Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
// Проверить произведение элементов какой диагонали больше.
public class Unit4Task2 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random r = new Random(); // создаём объект типа Random
        int n;
        n = sc.nextInt(); // вводим n с клавиатуры
        int mass[][] = new int[n][n]; //инициализация массива размером NxN
        for (int i = 0; i < n; i++) { //Заполнение массива случайными числами от 0 до 9
            for (int j = 0; j < n; j++)
                mass[i][j] = r.nextInt(50);
        }
        for (int i = 0; i < n; i++) {// вывод массива в консоль
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j)
                    a *= mass[i][j];
                {
                    if (i + j == n - 1)
                        b *= mass[i][j];
                }
            }
        System.out.println("Произведение на главной и побочной диагоналях " + a + " и " + b);
        if (a > b)
            System.out.println("Главная диагональ больше побочной");
        else if (a < b)
            System.out.println("Побочная диагональ больше главной");
        else
        System.out.println("Диагонали равны");
    }
}




