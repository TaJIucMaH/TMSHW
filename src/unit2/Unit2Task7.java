public class Unit2Task7 {
    //Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

    public static void main(String[] args) {

        int number;
        int summ = 0;

        for (number = 1; number <= 99; number += 2) {
            summ = summ + number;
        }
        System.out.println(summ);


    }
}
