package unit6;

import java.util.Random;

 class PassengerCar extends Nazemnii {   //легковой

    private String bodyType;  //тип кузова
    private int numberOfPassengers; //количество пассажиров
    private int people;

    Random rand = new Random();

    public PassengerCar(String model,int weigth, int maxSpeed, int power,  int numberWheels, int fuelСonsumption,String bodyType) {
        super(model, weigth, maxSpeed, power, numberWheels, fuelСonsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = rand.nextInt(11)+5;
    }

    private double fuel(int pacxod, double limit){
        double endfuel = limit/100*pacxod;
        return endfuel;
    }
    public String distance(double time){
        String str = "За время " + time+ " ч, автомобиль "+ getModel()+ " двигаясь с максимальной " +
                "скоростью "+ getMaxSpeed() + " км/ч проедет "+time*getMaxSpeed() +
                " км  и израсходует "+ fuel(getFuelСonsumption(),time*getMaxSpeed()) +" литров топлива\n";
        return str;
    }

    public String get_kharakteristiki() {

        String kharak = "model: " + getModel() + "\nweigth: " + getWeigth() + "\nmaxSpeed: " + getMaxSpeed() + "\npower" + getPower() + "\nnumberWheels: " +
                getNumberWheels() + "\nfuelСonsumption: " + getFuelСonsumption() + "\nnumberOfPassengers: " + getNumberOfPassengers()
                +"\nbodyType:" + getBodyType() + "\npowerWT: " + getPower();
        return kharak;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean is_fit() {

        System.out.println("Введите количество пассажиров");
        int a = rand.nextInt(20);
        System.out.println(a);
        if (a > numberOfPassengers) {
            System.out.println("Вам нужен автобус побольше");
            return true;
        } else {
            System.out.println("Все пассажиры поместились");
            return false;
        }
    }}