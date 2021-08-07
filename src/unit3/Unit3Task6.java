package unit3;

import java.util.Random;

// Создайте массив из 4-х случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class Unit3Task6 {

    public static void main(String[] args) {

        int[] mas = new int[4];
        int next;
        next = 0;
        for(int i=0; i<mas.length; i++){
            Random rand = new Random();
            mas[i] = rand.nextInt(10);
        }
        for(int i=0; i<mas.length; i++) {    //for (int new1 : mas) {
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        for(boolean = 0; i<mas.length-1; i++);   //почему булеан лучше? Если ставлю булеан, то код ругается.
            if (mas[i] > mas[i + 1]) {
                next = 1;
                break;
            }
        if(next==1) {
            System.out.println("Последовательность не является строго возрастающей");
        } else {
            System.out.println("Последовательность является строго возрастающей");
        }
    }
}

