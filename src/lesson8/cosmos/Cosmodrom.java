package lesson8.cosmos;

public class Cosmodrom {
    public static void main(String[] args) {

        Shattle newShattle = new Shattle();

        if (newShattle.beforeStart()) {

            System.out.println("Ok");
            newShattle.startEngine();
            newShattle.start();
        }
    }
}
