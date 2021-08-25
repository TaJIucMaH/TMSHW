package unit6;

public class Сivil extends Air {   //гражданский

    private boolean businessClass;  //наличие бизнес класса

    public Сivil(int weigth, int maxSpeed, int power, String model, int wingspan, int accelerationLength,boolean businessClass) {
        super(weigth, maxSpeed, power, model, wingspan, accelerationLength);
        this.businessClass = businessClass;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
