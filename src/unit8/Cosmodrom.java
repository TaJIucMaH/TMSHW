package unit8;

public class Cosmodrom {

    public static void Start(IStart ship) throws InterruptedException {
        if (ship.prevStartCheck()) {
            ship.startEngine();
            for (int i = 10; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(i);

            }
            ship.start();
        } else {
            System.out.println("Проверка не пройдена");
        }
    }

}

