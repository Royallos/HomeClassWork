package lesson9;

public class Runner {

    public static void main(String[] args) {

        MyService.checkAnna(MyService.class);
        MyService object1 = new MyService();
        MyService object2 = new MyService();
        object1.setA(5);
        object2.setA(5);
        object1.setB("a");
        object2.setB("b");
        System.out.println(object1.equals(object2));
    }
}
