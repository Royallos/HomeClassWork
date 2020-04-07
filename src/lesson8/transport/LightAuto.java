package lesson8.transport;

// В классе Легковой добавляются поля:
//         - Тип кузова - Кол-во пассажиров
//
//        В конечных классах (Легковой, Грузовой, Военный, Гражданский)
////        разработать метод описание который будет возвращать составленную строку
////        с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
////        Расчёт мощности в киловаттах производится в отдельном методе :
////        1 л.с = 0.74 кВ
//
//          Для легкового разработать метод который будет принимать время
//          и считать сколько километров проедет машина двигаясь с максимальной скоростью
//          и сколько топлива она израсходует за это время, результат вывести в консоль,
//          расчёт расходуемого топлива вынести в отдельный метод private.
//        Результат работы метода должен вывести такую строчку:
//        За время (ваше введённое время) ч, автомобиль (марка автомобиля)
//        двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
//        проедет (xxx) км  и израсходует (xxx) литров топлива.


public class LightAuto extends GroundAuto {

   int valueOfPassanger;
   String type;

   public LightAuto(String brand, double maxSpeed, double massa, int power, int wheels, double fuelPerDistance, int valueOfPassanger, String type) {

      super(brand, maxSpeed, massa, power, wheels, fuelPerDistance);
      this.valueOfPassanger = valueOfPassanger;
      this.type = type;
   }

   public void discription() {

      System.out.println("Brand: " + brand + " maxSpeed: " + maxSpeed + "km/h massa: " + massa + " power: " + power + " wheels: "
              + wheels + " fuelPerDistance: " + fuelPerDistance + " valueOfPassanger: " + valueOfPassanger + " type " + type + " power in Watt: " + powerW(this));
   }

   public double powerW(LightAuto o) {

      double watt =o.power * 0.74;
      return watt;
   }


   public void moveWithMaxSpeed (LightAuto o, int hour) {

      double usedFuel = countFuelPerHour(this);
      System.out.println("Per " + hour + " hours, driving by " + o.brand + " with " + maxSpeed + "  you'll drive " + maxSpeed*hour + "km and use " + maxSpeed*hour/100*usedFuel + "l of fuel");
   }

   private double countFuelPerHour (LightAuto o) {

      double tmp = o.fuelPerDistance * 2;
      return tmp;
   }
}
