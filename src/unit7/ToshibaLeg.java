package unit7;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }


    @Override
    public void step() {
        System.out.println("Нога Toshiba шагает");

    }

    @Override
    public int getPrice() {
        return price;
    }
}