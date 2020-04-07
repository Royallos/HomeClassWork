package lesson8.ex26;

public class DebitCard extends Card {

    private String debitCardType;
    public DebitCard(String s, String number, String createdDate, String debitCardType) {

        super(number, createdDate);
        debitCardType = debitCardType;
    }
}
