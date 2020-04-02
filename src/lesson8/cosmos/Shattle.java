package lesson8.cosmos;

import java.util.Random;

public class Shattle implements IStart {

    public Shattle () {}
    @Override
    public boolean beforeStart() {

        Random rand = new Random();
        int tmp = rand.nextInt(10);
        if (tmp <= 3) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is ready!");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    @Override
    public void start() {
        System.out.println("Start!");
    }
}
