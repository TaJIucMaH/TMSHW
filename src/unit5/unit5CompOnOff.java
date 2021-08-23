package unit5;

import java.util.Random;
import java.util.Scanner;

public class unit5CompOnOff {
    public static void main(String[] args) {
        Computer comp = new Computer("Intel", "Sata 512Gb", "16 Gb");
        comp.show();
        for (int i = 0; i < 10; i++) {
            if (!comp.on())
                break;
            if (!comp.off())
                break;
        }
    }
}

class Computer {
    String processor, disk, memory;
    int resource;
    boolean isBroken;

    void show() {
        System.out.println("Процессор - " + this.processor + "\n" +
                "Жёсткий диск - " + this.disk + "\n" +
                "Память - " + this.memory + "\n" +
                "Осталось ресурса - " + this.resource);
    }

    Computer(String processor, String disk, String memory) {
        this.processor = processor;
        this.disk = disk;
        this.memory = memory;
        this.resource = 10;
        this.isBroken = false;
    }


    boolean on() {
        if (notRight()) {
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            int r = rand.nextInt(2);
            int compare;
            System.out.print("Включился?! - ");
            while (true) {
                compare = scan.nextInt();
                if (compare == 0 || compare == 1) {
                    break;
                }
                System.out.println("onНеверное значение!\nВведите заново(0или1) - ");
            }
            if (compare != r) {
                this.isBroken = true;
            } else {
                resource--;
            }
            return true;
        } else return false;
    }

    public boolean notRight() {
        if (this.isBroken) {
            System.out.println("Ваш компьютер сгорел!");
            return false;

        }
        if (this.resource == 0) {
            System.out.println("Закончился ресурс! Ваш компьютер сгорел!");
            return false;
        }
        return true;
    }

    boolean off() {
        if (notRight()) {
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            int r = rand.nextInt(2);
            int compare;
            System.out.print("Выключился?! - ");
            while (true) {
                compare = scan.nextInt();
                if (compare == 0 || compare == 1) {
                    break;
                }
                System.out.println("offНеверное значение!\nВведите заново(0или1) - ");
            }
            if (compare != r) {
                this.isBroken = true;
            } else {
                resource--;
            }
            return true;
        } else return false;
    }
}


