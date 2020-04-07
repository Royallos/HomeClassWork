package lesson8.robot1.hands;

import lesson8.robot1.heads.SamsungHead;

public class SamsungHand implements IHand {
    int price;
    public SamsungHand(int price) {

        this.price = price;
    }
    @Override
    public void upHand() {
        System.out.println("SamsungHand is up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
