package unit4;
//Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
// Вывести нечетные элементы, находящиеся под главной диагональю.

import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    private static int i;
    private static int j;

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

        for (int i = 1; i < mass.length; i++){
            for (int j = 0; j < i; j++){
                if (mass[i][j] % 2 != 0) {
                    System.out.println("нечетные элементы, находящиеся под главной диагональю " + mass[i][j]);
                }
//как без privat static сделать(фигурные скобки расставить что ли), что бы выводило перечисление
// нечетных элементов в одной строке?

    }}}
}
