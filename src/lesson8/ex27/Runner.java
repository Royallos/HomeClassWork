package lesson8.ex27;

public class Runner {

    public static void main(String[] args) {

        CheapPhone alcatel = new CheapPhone("x10", "alcatel", "mobil phone", 100);
        MobilePhone iPhone = new MobilePhone("10", "apple", "mobil phone");
        MobilePhone meizu = new MobilePhone("16th", "meizu", "mobil phone");

        iPhone.switchOn();
        alcatel.switchOn();

        iPhone.setCategory("12");
        meizu.setCategory("11");
        alcatel.setPrice(10);
        int i = alcatel.getPrice();

        System.out.println(iPhone.getCategory());
        System.out.println(meizu.getCategory());
        System.out.println(i);
    }
}