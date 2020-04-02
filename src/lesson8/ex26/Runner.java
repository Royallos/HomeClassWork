package lesson8.ex26;

public class Runner {

    public static void main(String[] args) {

        Owner vasya = new Owner("0000", "09/10", "credit", "mastercard", "vasya", "ivanov");
        Type credit = new Type("0000", "09/10", "credit", "maestro");

        vasya.setNumber("0000");
        System.out.println(vasya.getNumber());

        credit.setType("credit");
        System.out.println(credit.getType());
    }
}