package lesson8.transport;

//        В классе Военный  добавляются поля:
//        - Наличие системы катапультирования (true/false) - Кол-во ракет на борту
//
//        В конечных классах (Легковой, Грузовой, Военный, Гражданский)
////        разработать метод описание который будет возвращать составленную строку
////        с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
////        Расчёт мощности в киловаттах производится в отдельном методе :
////        1 л.с = 0.74 кВ



public class Army extends Air {

    boolean catapult;
    int rocket;

    public Army (String brand, double maxSpeed, double massa, int power, double height, double lengthOfRoad, boolean catapult, int rocket) {

        super(brand, maxSpeed, massa, power, height, lengthOfRoad);
        this.catapult = catapult;
        this.rocket = rocket;
    }

//    разработать метод описание который будет возвращать составленную строку
////        с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
////        Расчёт мощности в киловаттах производится в отдельном методе :
////        1 л.с = 0.74 кВ
    public void discription() {

        System.out.println("Brand: " + brand + " maxSpeed: " + maxSpeed + " massa: " + massa + " power: " + power + " height: "
        + height + " lengthOfRoad: " + lengthOfRoad + " catapult: " + catapult + " rocket " + rocket);
    }

    public double powerW(Army o) {

        double watt =o.power * 0.74;
        return watt;
    }

    public void shot(int shotNumber) {

            if (rocket >= shotNumber) {

                for (int j = 0; j < shotNumber; j++) {

                    System.out.println("Boom");
                }
                rocket -= shotNumber;
                System.out.println("You have " + rocket + " rocket");
            } else{
                for (int j = 0; j < rocket; j++) {

                    System.out.println("Boom");
                }
                rocket -= shotNumber;
                System.out.println("No more rocket");
            }
    }
    public void catapult() {

        if (catapult) {

            System.out.println("Ok");
        } else {

            System.out.println("Not ok");
        }
    }
}
