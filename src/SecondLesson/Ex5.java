package SecondLesson;

//        Задание 5
//        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?

public class Ex5 {

    public static void main(String[] args) {

        int n = 1234;

        int z = n % 10;
        int a = n - z;
        int y = (a % 100)/10;
        int b = a - y;
        int x = (b % 1000) / 100;
        int c = b - x;
        int w = (c % 10000) / 1000;

//        if (z==y && y==x && x==w) {

//        не правильно условие построено. Надо проверить что все цифры числа разные (c)

        if (z!=y && z!=x && z!=w && y!=x && y!=w && x!=w) {


                System.out.println("All numbers are different");

        } else {

            System.out.println("Some numbers are the same");
        }

    }

}
