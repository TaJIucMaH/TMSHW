package unit8;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Проверка шатла");
        Cosmodrom.Start(new Shuttle());
        System.out.println();
        System.out.println("Проверка SpaceX");
        Cosmodrom.Start(new SpaceX());


    }
}
