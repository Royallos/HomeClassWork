package lesson8.clothes;
import lesson8.clothes.Jacket;
import lesson8.clothes.Pants;
import lesson8.clothes.Shoes;

    public class HumanClass implements Human {

        private String name;
        private Jacket jacket;
        private Pants pants;
        private Shoes shoes;

        public HumanClass(String name, Jacket jacket, Pants pants, Shoes shoes) {

            this.name = name;
            this.jacket = jacket;
            this.pants = pants;
            this.shoes = shoes;
        }

        @Override
        public void putOnAll() {
            jacket.putOn();
            pants.putOn();
            shoes.putOn();
        }

        @Override
        public void takeOffAll() {
            jacket.takeOff();
            pants.takeOff();
            shoes.takeOff();
        }
    }
