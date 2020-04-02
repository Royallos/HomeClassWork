package lesson8.ex26;

public class Owner extends Type {

    private String firstName;
    private String lastName;

    public Owner (String number, String createdDate, String type, String corparation, String firstName, String lastName) {

        super(number, createdDate, type, corparation);
        firstName = firstName;
        lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void show() {

    }
}
