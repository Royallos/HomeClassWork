package ThirdLesson;
import java.util.Random;

//        Задание 8
//        Имеется целове число (задать с помощью Random rand = new Random(); int x =
//        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.

public class Ex8 {

    public static void main(String[] args) {

        Random rand = new Random();
        int x =rand.nextInt(10);

        if (x > 0) {

            switch (x) {

                case 1:
                    System.out.println(x + " Рубль");
                    break;
                case 2:
                    System.out.println(x + " Рубля");
                    break;
                case 3:
                    System.out.println(x + " Рубля");
                    break;
                case 4:
                    System.out.println(x + " Рубля");
                    break;

            }

            if (x > 4) {

                System.out.println(x + " Рублей");

            }

        } else {

            System.out.println("Zero");
        }

    }

}
