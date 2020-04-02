package lesson8.ex27;

public abstract class Appliance {

    private String model;
    private String brand;

    public Appliance (String model, String brand) {

        brand = brand;
        model = model;
    }

    public String getModel() {

        return model;
    }
    public void setModel(String  model) {

        this.model = model;
    }

    public String getBrand() {

        return brand;
    }
    public void setBrand(String brand) {

        this.brand = brand;
    }

    abstract void switchOn();
    
}