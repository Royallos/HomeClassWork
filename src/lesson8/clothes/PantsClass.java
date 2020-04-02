package lesson8.clothes;

public class PantsClass implements Pants {
    @Override
    public void putOn() {
        System.out.println("You put on Pants");
    }

    @Override
    public void takeOff() {
        System.out.println("You take off Pants");
    }
}
