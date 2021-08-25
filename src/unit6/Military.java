package unit6;

public class Military extends Air{   //военный

    private int numberOfMissiles;   //количество ракет
    private boolean ejectionSystem;   //наличие системы катапультировния


    public Military(int weigth, int maxSpeed, int power, String model, int wingspan, int accelerationLength,int numberOfMissiles,boolean ejectionSystem) {
        super(weigth, maxSpeed, power, model, wingspan, accelerationLength);
        this.numberOfMissiles = numberOfMissiles;
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }
}
