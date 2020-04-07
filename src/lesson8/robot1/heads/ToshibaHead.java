package lesson8.robot1.heads;

public class ToshibaHead implements IHead {
    int price;
    public ToshibaHead(int price) {

        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("ToshibaHead speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
