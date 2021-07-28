package unit2;

//Вывести на экран последовательность чисел от 0 до 10 три раза каждый раз используя  разные циклы.
public class Unit2Task0 {

    public static void main(String[] args) {
        int x = 0;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
        int y;
        for (y = 0; y < 11; y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        int z = -1;
        do {
            z++;
            System.out.print(z + " ");
        } while (z < 10);
    }
}

