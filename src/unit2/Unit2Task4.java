public class Unit2Task4 {

    //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int d = 0;

        if (a != 0 && b != 0) {
            while (b != 0) {
                d += a;
                b--;
            }
        } else {
            d = 0;
        }
        System.out.println(d);

    }
}


