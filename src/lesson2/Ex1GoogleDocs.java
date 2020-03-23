package lesson2;
import java.util.Scanner;

//        1)В переменную записываем число. Надо вывести на экран сколько в этомчисле цифр
//        и положительное оно или отрицательное. Например, "этооднозначное положительное число".
//        Достаточно будет определить, является личисло однозначным, "двухзначным или трехзначным и более.

public class Ex1GoogleDocs {

    public static void main(String[] args) {

//        Можно пройтись в цикле по каждой цифре (будет универсальное решение для числа любой разрядности)

//      Не понял что нужно сделать. Поясните, пожалуйста.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();

        if (a > -10 && a < 10) {
            if (a > 0) {

                System.out.println("It's positive 1-symbol number");

            } else {

                System.out.println("It's negative 1-symbol number");

            }

        }
        if ((a > -100 && a < -9) || (a < 100 && a > 9)) {
            if (a > 0) {

                System.out.println("It's positive 2-symbol number");

            } else {

                System.out.println("It's negative 2-symbol number");

            }

        }
        if ((a > -1000 && a < -99) || (a < 1000 && a > 99)) {

            if (a > 0) {

                System.out.println("It's positive 3-symbol number");

            } else {

                System.out.println("It's negative 3-symbol number");

            }

        }

    }

}