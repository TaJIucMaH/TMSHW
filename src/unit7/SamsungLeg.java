package unit7;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {

    }


    @Override
    public void step() {
        System.out.println("Нога Samsung шагает");

    }

    @Override
    public int getPrice() {
        return price;
    }
}