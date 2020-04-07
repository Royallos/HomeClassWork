package lesson8.robot1.legs;

public class SamsungLeg implements ILeg {

    int price;
    public SamsungLeg(int price) {

        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("SamsungLeg moves");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
