package unit6;

public class PassengerCar extends Nazemnii {   //легковой



    private String bodyType;  //тип кузова
    private int numberOfPassengers; //количество пассажиров

    public PassengerCar(String model,int weigth, int maxSpeed, int power,  int numberWheels, int fuelСonsumption,String bodyType,int numberOfPassengers) {
        super(model, weigth, maxSpeed, power, numberWheels, fuelСonsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
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
}