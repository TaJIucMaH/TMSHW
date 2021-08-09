package unit4;

import java.util.Random;
import java.util.Scanner;

//Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
// Посчитать сумму четных элементов, стоящих над побочной диагональю.
public class Unit4Task3 {
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
        for (int i = 1; i < mass.length; i++) {
            for (int j = 0; j < i; j++) {
                if (mass[i][j] % 2 != 0) {
                    System.out.println("Нечётные элементы, находящиеся под главной диагональю " + mass[i][j]);
                } } }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i][j] % 2 != 1) {
                    System.out.println("Четные элементы, находящиеся над главной диагональю " + mass[i][j]);
                } } }
        System.out.println();
        int sum=0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - i - 1; j++) {
                if (mass[i][j] % 2 == 0){
                    sum += mass[i][j];
                    System.out.println("Чётные элементы, находящиеся над побочной диагональю " + mass[i][j]);
            }}}
            System.out.println("Сумма чётных элементов над побочной диагональю " + sum);

        System.out.println();

        for (int i = 1; i < mass.length; i++) {
            for (int j = mass.length-i; j < mass.length ; j++) {
                if (mass[i][j] % 2 != 0) {
                    System.out.println("Нечётные элементы, находящиеся под побочной диагональю " + mass[i][j]);
                }
            }
        }
    }}
