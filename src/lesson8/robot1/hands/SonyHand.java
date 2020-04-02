package lesson8.robot1.hands;

public class SonyHand implements IHand {
    int price;
    public SonyHand(int price) {

        this.price = price;
    }
    @Override
    public void upHand() {
        System.out.println("SonyHand is up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
