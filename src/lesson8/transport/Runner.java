package lesson8.transport;

public class Runner {
    public static void main(String[] args) {
        Light audi = new Light("Audi", 200, 1800, 180, 4, 10, 5, "cabrio");
        Heavy volvo = new Heavy("volvo", 120, 4000, 150, 6, 15, 6000);
        Army stels = new Army("stels", 450, 850, 1000, 5, 200, true, 8);
        audi.discription();
        audi.moveWithMaxSpeed(audi, 2);
        volvo.discription();
        volvo.putOn(6100);
        volvo.putOn(5900);
        stels.shot(5);
        stels.shot(5);
        stels.catapult();
    }
}
