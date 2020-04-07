package lesson8.robot1.legs;

public class ToshibaLeg implements ILeg {
    int price;
    public ToshibaLeg(int price) {

        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("ToshibaLeg moves");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
