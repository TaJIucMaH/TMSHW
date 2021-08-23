public class Unit2Task1 {

    // Начав тренировки, спортсмен в первый день пробежал 10 км.
    // Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
    // Какой суммарный путь пробежит спортсмен за 7 дней?
    public static void main(String[] args) {

        int day = 1;
        double dist = 10;
        double sum = 10;
        while (day < 7) { //не могу понять, что поменять, что  бы правильно считало!!! Теперь понял)
            dist = dist + dist * 0.1;
            sum = sum + dist;
            System.out.println(sum);
            day++;
        }
        System.out.println(sum);

    }
}

