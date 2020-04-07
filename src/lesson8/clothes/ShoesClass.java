package lesson8.clothes;

public class ShoesClass implements Shoes {
    @Override
    public void putOn() {
        System.out.println("You put on Shoes");
    }

    @Override
    public void takeOff() {
        System.out.println("You take off Shoes");
    }
}
