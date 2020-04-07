package lesson8.ex26;

public class DebitBalance extends DebitCard {

    private int debtAllowed;
    public DebitBalance(String number, String createdDate, String type, String corparation, int debtAllowed) {
        super(number, createdDate, type, corparation);
        debtAllowed = debtAllowed;
    }

    public int getDebtAllowed() {
        return debtAllowed;
    }

    public void setDebtAllowed(int debtAllowed) {
        this.debtAllowed = debtAllowed;
    }
}
