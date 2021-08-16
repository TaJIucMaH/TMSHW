public class Unit2Task5 {

    //Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    // для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

    public static void main(String[] args) {

        int inch;
        double metr;

        for (inch = 1; inch <= 20; inch++) {
            metr = 2.54 * inch;

            System.out.println(inch + " дюйм = " + metr + " сантиметров");
        }
    }
}
