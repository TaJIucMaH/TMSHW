package unit3;

import java.util.Random;
import java.util.Scanner;

//Пользователь должен указать с клавиатуры положительное число, а программа должна создать массив указанного размера
// из случайных целых чисел из [0;15] и вывести его на экран в строку. После этого программа должна определить
// и сообщить пользователю о том, сумма какой половины массива больше: левой или правой, либо сообщить,
// что эти суммы модулей равны. Если пользователь введёт неподходящее число, то выдать соответствующее сообщение
public class Unit3Task9 {

    public static void main(String[] args) {

        int n = 0, a, s1 = 0, s2 = 0;
        do {
            System.out.print("\nВведите число: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0 ) {
                    int[] mas = new int[n];
                    for (int i = 0; i < mas.length; i++) {
                        Random rand = new Random();
                        mas[i] = rand.nextInt(15);
                        System.out.print(mas[i] + " ");
                    }
                    a = mas.length / 2;
                    for (int i = 0; i < a; i++) {
                        s1 = s1 + Math.abs(mas[i]);
                    }
                    for (int i = a; i < mas.length; i++) {
                        s2 = s2 + Math.abs(mas[i]);
                    }
                    if (s1 < s2) {
                        System.out.print("Сумма модулей 1-й половины < суммы модулей 2-й половины");
                    } else if (s1 > s2) {
                        System.out.print("Сумма модулей 2-й половины < суммы модулей 1-й половины");
                    } else {
                        System.out.println("\nСумма модулей =");
                    }
                }
            }
        } while (n <= 0 || n % 2 != 0);
    }
}