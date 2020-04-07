package lesson8.transport;

//В классе Наземный добавляются поля:
//        -Количество колёс
//        - Расход топлива(л/100км)


public class GroundAuto extends Transport {

    int wheels;
    double fuelPerDistance;

    public GroundAuto(String brand, double maxSpeed, double massa, int power, int wheels, double fuelPerDistance) {

        super(brand, maxSpeed, massa, power);
        this.wheels = wheels;
        this.fuelPerDistance = fuelPerDistance;
    }

}
