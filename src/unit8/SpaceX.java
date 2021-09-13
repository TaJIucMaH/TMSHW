package unit8;

import java.util.Random;
import java.util.Scanner;

public class SpaceX implements IStart{

    @Override
    public boolean prevStartCheck() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int r = rand.nextInt(15);
        return r<7;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");

    }
}
