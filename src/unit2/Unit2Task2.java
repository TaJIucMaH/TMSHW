public class Unit2Task2 {

    //Одноклеточная амеба каждые 3 часа делится на 2 клетки.
    // Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
    public static void main(String[] args) {

        String y = null;
        String x = null;
        int ameba = 1;
        int z = 0;
        int i = z % 10;
        for (i = 3; i <= 24; i += 3) {
            ameba *= 2;
            if ((i == 0) || (i >= 5) && (i <= 9) || (i >= 11) && (i <= 19)) {
                x = "амеб";
                y = "часов";
            } else if (i == 1) {
                x = "амеба";
                y = "час";
            } else if ((i >= 2) && (i <= 4)) {
                x = "амебы";
                y = "часа";
            }
            System.out.println("Через " + i + " " + y + " будет " + ameba + " " + x);
            // 32 амебы и 21 час выводит неправильно
        }
    }
}
