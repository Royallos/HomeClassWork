package lesson8.robot1.heads;

public class SamsungHead implements IHead {
    private int price;
    public SamsungHead (int price) {

        this.price = price;
    }
    @Override
    public void speek() {
        System.out.println("SamsungHead speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
