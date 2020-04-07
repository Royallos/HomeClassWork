package lesson8.robot1.legs;

public class SonyLeg implements ILeg {

    int price;
    public SonyLeg(int price) {

        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("SonyLeg moves");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
