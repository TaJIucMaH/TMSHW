package unit4;

import java.util.Random;
import java.util.Scanner;

//Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//Транспонировать матрицу (1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
public class Unit4Task4 {
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
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Новая матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( mass[i][j] + " "); // %3d возможно использовать вместо " ",
            }
            System.out.println();

}}}
