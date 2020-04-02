package lesson8.transport;

//        В классе Транспорт есть поля:
//        - Мощность(в лошадиных силах) - Максимальная скорость(км/ч) - Масса (кг)
//        - Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )


public class Transport {

    String brand;
    double maxSpeed;
    double massa;
    int power;

    public Transport ( String brand, double maxSpeed, double massa, int power) {

        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.massa = massa;
        this.power = power;
    }

}
