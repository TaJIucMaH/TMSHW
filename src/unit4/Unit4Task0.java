package unit4;
//Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
// Поссчитать сумму четных элементов, стоящих на главной диагонали.

import java.util.Random;
import java.util.Scanner;

public class Unit4Task0 {

    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random r = new Random(); // создаём объект типа Random
        int n;
        n = sc.nextInt(); // вводим n с клавиатуры
        int mass[][] = new int[n][n]; //инициализация массива размером NxN
        for (int i = 0; i < mass.length; i++) { //Заполнение массива случайными числами от 0 до 51
            for (int j = 0; j < mass.length; j++)
                mass[i][j] = r.nextInt(51);
        }
        for (int i = 0; i < mass.length; i++) {// вывод массива в консоль
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0, j = 0; i < mass.length & j<mass.length; i++, j++) {
            if (mass[i][j] % 2 == 0){
                sum += mass[i][j];
                System.out.println("Чётные элементы, находящиеся на главной диагонали " + mass[i][j]);
        }}
                System.out.println("Сумма чётных элементов на главной диагонали " + sum);

    }}
