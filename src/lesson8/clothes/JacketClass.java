package lesson8.clothes;

public class JacketClass implements Jacket {
    @Override
    public void putOn() {
        System.out.println("You put on jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("You take off jacket");
    }
}
