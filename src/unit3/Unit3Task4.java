package unit3;


import java.util.Random;

//Создайте массив из 20 случайных целых чисел из отрезка [0; 20]. Выведите массив на экран в строку.
// Замените каждый элемент с нечетным индексом на ноль. Снова выведите массив на экран на отдельной строке
public class Unit3Task4 {

    public static void main(String[] args) {


        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            Random rand = new Random();
            mas[i] = rand.nextInt(99);
        }
        for (int ma : mas) {
            System.out.print(ma + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                mas[i] = 0;
            }
            System.out.print(mas[i] + "  ");
        }
    }
}
