package SecondLesson;

//        Задание 4
//        Определить число, полученное выписыванием в обратном порядке цифр
//        любого 4-х значного натурального числа n.

public class Ex4 {

    public static void main (String [] args) {

        int n = 5236;

        int z = n % 10;
        int a = n - z;
        int y = (a % 100)/10;
        int b = a - y;
        int x = (b % 1000) / 100;
        int c = b - x;
        int w = (c % 10000) / 1000;

        System.out.println("Number is " + z + y + x + w);

    }

}

