public class Unit2Task3 {

    //Вычислить:  1+2+4+8+…+256
    public static void main(String[] args) {

        int i;
        int a = 0;
        for (i = 1; i < 300; i *= 2) {
            a += i;
        }
        System.out.println(a);
    }

}

