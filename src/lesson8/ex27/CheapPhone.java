package lesson8.ex27;

public class CheapPhone extends MobilePhone {

    int price;

    public CheapPhone(String model, String brand, String category, int price) {
        super(model, brand, category);

        price = price;

    }
    public void setPrice(int i) {

        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
