package SecondLesson;

//        Задание 5
//        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?

public class Ex5 {

    public static void main(String[] args) {

        int n = 1111;

        int z = n % 10;
        int a = n - z;
        int y = (a % 100)/10;
        int b = a - y;
        int x = (b % 1000) / 100;
        int c = b - x;
        int w = (c % 10000) / 1000;

        if (z==y && y==x && x==w) {

            System.out.println("All num is the same");

        } else {

            System.out.println("All num isn't the same");
        }

    }

}
