package unit6;

import java.util.Scanner;

class Cargo extends Nazemnii { //грузовой

    private int loadCapacity;  //грузоподъёмность
    private int luggage;  //багаж

    public Cargo(String model, int weigth, int maxSpeed, int power, int numberWheels, int fuelСonsumption,
                  int loadCapacity) {
        super(model, weigth, maxSpeed, power, numberWheels, fuelСonsumption);
        this.loadCapacity = loadCapacity;
    }

    public String get_kharakteristiki() {
        String model = getModel();
        String weigth = Integer.toString(getWeigth());
        String maxSpeed = Integer.toString(getMaxSpeed());
        String power = Integer.toString(getPower());
        String numberWheels = Integer.toString(getNumberWheels());
        String fuelСonsumption = Integer.toString(getFuelСonsumption());
        String loadCapacity = Integer.toString(getLoadCapacity());
        String powerWT = Double.toString(powerWT(getPower()));
        String kharak = "model: " + model + "\nweigth: " + weigth + "\nmaxSpeed: " + maxSpeed + "\npower" + power + "\nnumberWheels: " +
                numberWheels + "\nfuelСonsumption: " + fuelСonsumption +  "\nloadCapacity: " + loadCapacity + "\npowerWT: " + powerWT;
        return kharak;
    }


    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean is_fit() {
        Scanner luggage = new Scanner(System.in);
        System.out.println("Введите размер багажа");
        int a = luggage.nextInt();
        if (a > loadCapacity) {
            System.out.println("Вам нужен грузовик побольше");
            return true;
        } else {
            System.out.println("Весь багаж влез в грузовую машину");
            return false;
        }
    }


}