package lesson8.clothes;
import lesson8.clothes.Jacket;
import lesson8.clothes.Pants;
import lesson8.clothes.Shoes;


public class Run {
    public static void main(String[] args) {

        Jacket jacket = new JacketClass();
        PantsClass pants = new PantsClass();
        ShoesClass shoes = new ShoesClass();

        HumanClass human = new HumanClass("Vasya", jacket, pants, shoes);

        human.putOnAll();
        human.takeOffAll();
    }
}
