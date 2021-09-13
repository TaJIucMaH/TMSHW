package unit8;

import java.util.Random;
import java.util.Scanner;

public class Shuttle implements IStart {

    @Override
    public boolean prevStartCheck() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int r = rand.nextInt(10);
        return r>3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла");

    }
}
