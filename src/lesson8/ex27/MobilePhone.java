package lesson8.ex27;

public class MobilePhone extends Appliance {

    private String category;

    public MobilePhone(String model, String brand, String category) {
        super(model, brand);

        category = category;
    }
    public void setCategory(String category) {

        this.category = category;
    }
    public String getCategory() {

        return category;
    }

    @Override
    void switchOn() {

        System.out.println("Phone is on");
    }

}
