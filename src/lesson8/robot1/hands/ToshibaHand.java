package lesson8.robot1.hands;

public class ToshibaHand implements  IHand {
    int price;
    public ToshibaHand(int price) {

        this.price = price;
    }
    @Override
    public void upHand() {

        System.out.println("ToshibaHand is up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
