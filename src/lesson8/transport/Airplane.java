package lesson8.transport;

//        В классе Воздушный добавляются поля:
//        - Размах крыльев (м)
//        - Минимальная длина взлётно-посадочной полосы для взлёта

public class Airplane extends Transport {

    double height;
    double lengthOfRoad;

    public Airplane(String brand, double maxSpeed, double massa, int power, double height, double lengthOfRoad) {

        super(brand, maxSpeed, massa, power);
        this.height = height;
        this.lengthOfRoad = lengthOfRoad;

    }
}
