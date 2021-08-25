package unit6;

public class Transport {
    private String model;
    private int weigth;   //масса
    private int maxSpeed;
    private int power;

    public double powerWT(int power){
        return power * 0.74;
    }

    public Transport(String model, int weigth, int maxSpeed, int power) {
        this.model = model;
        this.weigth = weigth;
        this.maxSpeed = maxSpeed;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
