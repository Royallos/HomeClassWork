package lesson8.ex26;

public class Type extends Card {

    private String type;
    private String corparation;

    public Type (String number, String createdDate, String type, String corparation) {

        super(number, createdDate);

        type = type;
        corparation = corparation;
    }

    public String getCorparation() {
        return corparation;
    }

    public void setCorparation(String corparation) {
        this.corparation = corparation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
