package unit6;

public class Air extends Transport{


    private int wingspan;  //размах крыльев
    private int accelerationLength;  //длинна разгона

    public Air(int weigth, int maxSpeed, int power, String model,int wingspan,int accelerationLength) {
        super(model,weigth, maxSpeed, power);
        this.wingspan = wingspan;
        this.accelerationLength = accelerationLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getAccelerationLength() {
        return accelerationLength;
    }

    public void setAccelerationLength(int accelerationLength) {
        this.accelerationLength = accelerationLength;
    }
}
