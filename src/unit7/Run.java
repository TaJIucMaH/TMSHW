package unit7;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot[] robots = new Robot[3];
        robots[0] = new Robot(new SamsungHead(30), new SonyHand(25), new ToshibaLeg(27));
        robots[1] = new Robot(new SonyHead(23), new ToshibaHand(28), new SamsungLeg(22));
        robots[2] = new Robot(new ToshibaHead(31), new SamsungHand(29), new SonyLeg(20));

        int maxIndex = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Робот " +(i+1) );
            robots[i].action();
            System.out.println();
        }
        int max = 0;

        for (int i = 0; i < 3; i++) {
            if (robots[i].getPrice() > max) {
                max = robots[i].getPrice();
                maxIndex = i;
            }
        }
        System.out.println("Самый дорой робот " + (maxIndex+1) + ". Его стоимость " + max);
    }
}
