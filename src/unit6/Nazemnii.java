package unit6;

public class Nazemnii extends Transport {

    public Nazemnii(String model,int weigth, int maxSpeed, int power,  int numberWheels, int fuelСonsumption) {
        super(model, weigth, maxSpeed, power);
        this.numberWheels = numberWheels;   //количество колес
        this.fuelСonsumption = fuelСonsumption;  //расход топлива

    }
       private int numberWheels;  //количество колес
       private int fuelСonsumption;  //расход топлива




    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }
}