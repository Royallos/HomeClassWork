package lesson8.transport;

//        В классе Гражданский добавляются поля:
//        - Кол-во пассажиров
//        - Наличие бизнес класса (true/false)
//
//        В конечных классах (Легковой, Грузовой, Военный, Гражданский)
////        разработать метод описание который будет возвращать составленную строку
////        с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
////        Расчёт мощности в киловаттах производится в отдельном методе :
////        1 л.с = 0.74 кВ

public class PeoplesAirplane extends Airplane {

    boolean business;
    int maxPassangers;

    public PeoplesAirplane(String brand, double maxSpeed, double massa, int power, double height, double lengthOfRoad, boolean business, int maxPassangers) {

        super(brand, maxSpeed, massa, power, height, lengthOfRoad);
        this.business = business;
        this.maxPassangers = maxPassangers;

    }

    public void discription() {

        System.out.println("Brand: " + brand + " maxSpeed: " + maxSpeed + " massa: " + massa + " power: " + power + " height: "
                + height + " lengthOfRoad: " + lengthOfRoad + " business: " + business + " maxPassangers " + maxPassangers);
    }

    public double powerW(PeoplesAirplane o) {

        double watt =o.power * 0.74;
        return watt;
    }

    public void volume(int passangerValue) {

        if (maxPassangers <= passangerValue) {

            System.out.println("Ok");
        } else {

            System.out.println("Not ok");
        }
    }
}
