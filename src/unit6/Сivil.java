package unit6;

import java.util.Random;

class Civil extends Air {   //гражданский
    int numberOfPassengers;
    private boolean businessClass;  //наличие бизнес класса
    Random rand = new Random();

    public Civil(String model, int weigth, int maxSpeed, int power,  int wingspan, int accelerationLength) {
        super(weigth, maxSpeed, power, model, wingspan, accelerationLength);
        this.numberOfPassengers = rand.nextInt(50)+50;
        this.businessClass = rand.nextBoolean();
    }
    public String get_kharakteristiki() {

        String kharak = "model: " + getModel() + "\nweigth: " + getWeigth() + "\nmaxSpeed: " + getMaxSpeed() + "\npower" + getPower() +
                   "\nnumberOfPassengers: " + getNumberOfPassengers()
                 + "\npowerWT: " + powerWT(getPower()) + "\nwingspan " + getWingspan()+ "\naccelerationLength "+ getAccelerationLength() +
                "\nbusinessClass "+ isBusinessClass();
        return kharak;
    }


    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public boolean is_fit() {

        System.out.println("Введите количество пассажиров");
        int a = rand.nextInt(130);
        System.out.println(a);
        if (a > numberOfPassengers) {
            System.out.println("Вам нужен самолёт побольше");
            return true;
        } else {
            System.out.println("Все пассажиры поместились в самолёт");
            return false;
        }
    }}