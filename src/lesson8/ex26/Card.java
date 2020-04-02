package lesson8.ex26;

public class Card {

    private String number;
    private String createdDate;

    public Card (String number, String createdDate) {

        number = number;
        createdDate = createdDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
