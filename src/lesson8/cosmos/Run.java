package lesson8.cosmos;

public class Run {
    public static void main(String[] args) {

        IStart shattle = new Shattle();
        Cosmodrom cosmodrom = new Cosmodrom();
        cosmodrom.startShattle(shattle);

    }
}
