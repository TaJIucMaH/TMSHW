package unit6;

public class Military extends Air {   //военный

    private int numberOfMissiles;   //количество ракет
    private boolean ejectionSystem;   //наличие системы катапультировния
    private int countShots;


    public Military(String model, int weigth, int maxSpeed, int power, int wingspan, int accelerationLength, int numberOfMissiles, boolean ejectionSystem) {
        super(weigth, maxSpeed, power, model, wingspan, accelerationLength);
        this.numberOfMissiles = numberOfMissiles;
        this.ejectionSystem = ejectionSystem;
    }

    public String get_kharakteristiki() {

        String kharak = "model: " + getModel() + "\nweigth: " + getWeigth() + "\nmaxSpeed: " + getMaxSpeed() + "\npower" + getPower() +
                "\npowerWT: " + powerWT(getPower()) + "\nwingspan " + getWingspan() + "\naccelerationLength " + getAccelerationLength()+
                "\nnumberOfMissiles " + getNumberOfMissiles()+ "\nejectionSystem "+ isEjectionSystem();
        return kharak;
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

    public void shot() {
        if (numberOfMissiles > 0) {
            countShots++;
            System.out.println("Ракета "+countShots+" пошла");
            numberOfMissiles--;

        } else {
            System.out.println("Боеприпасы отсутствуют");

        }
    }

    public void shotAll()
    {
        while (numberOfMissiles>0)
            shot();
    }
}