package lesson8.transport;

//          В классе Грузовой добавляется  поле:
//        - Грузоподъёмность(т)
//
//        В конечных классах (Легковой, Грузовой, Военный, Гражданский)
////        разработать метод описание который будет возвращать составленную строку
////        с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
////        Расчёт мощности в киловаттах производится в отдельном методе :
////        1 л.с = 0.74 кВ

public class HeavyAuto extends GroundAuto {

    double pickUp;

    public HeavyAuto(String brand, double maxSpeed, double massa, int power, int wheels, double fuelPerDistance, double pickUp) {

        super(brand, maxSpeed, massa, power, wheels, fuelPerDistance);
        this.pickUp = pickUp;
    }

    public void discription() {

        System.out.println("Brand: " + brand + " maxSpeed: " + maxSpeed + " massa: " + massa + " power: " + power + " wheels: "
                + wheels + " fuelPerDistance: " + fuelPerDistance + " pickUp: " + pickUp + " power in Watt: " + powerW(this));
    }

    public double powerW(HeavyAuto o) {

        double watt =o.power * 0.74;
        return watt;
    }

    public void putOn(int weight) {

        if (pickUp <= weight) {

            System.out.println("Ok");
        } else {

            System.out.println("Not ok");
        }
    }
}
