package Lesson3;
import java.util.Random;

//        Задание 8
//        Имеется целове число (задать с помощью Random rand = new Random(); int x =
//        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.

public class Ex8 {

    public static void main(String[] args) {

        Random rand = new Random();
        int x =rand.nextInt();
//
//        if (x > 0) {
//
//            switch (x) {
//
//                case 1:
//                    System.out.println(x + " Рубль");
//                    break;
//                case 2:
//                    System.out.println(x + " Рубля");
//                    break;
//                case 3:
//                    System.out.println(x + " Рубля");
//                    break;
//                case 4:
//                    System.out.println(x + " Рубля");
//                    break;
//
//            }
//
//            if (x > 4) {
//
//                System.out.println(x + " Рублей");
//
//            }
//
//        } else {
//
//            System.out.println("Zero");
//        }


//        switch - case тут не лучшее решение.
//                Не все условия соблюдены (попробуй 21,22 и т.п.) (c)

        if (x > 0) {

            if (x % 10 > 1 && x % 10 < 5) {

                System.out.println(x + " рубля");

            } else if (x % 10 > 4 && x% 10 < 10 || x % 10 == 0) {

                System.out.println(x + " рублей");
            } else {

                System.out.println(x + " рубль");
            }
        } else {

            System.out.println("Negative number");
        }

    }

}