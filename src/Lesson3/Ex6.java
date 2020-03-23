package Lesson3;
import java.util.Scanner;

//        Задание 6
//        Создайте число. Определите, является ли число трехзначным. Определите, является
//        ли его последняя цифра семеркой. Определите, является ли число четным.

public class Ex6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");

        int a = scan.nextInt();

        if ((a > -1000 && a < -99) || (a < 1000 && a > 99)) {

            if (a > 0) {

                System.out.println("It's positive 3-symbol number");

            } else {

                System.out.println("It's negative 3-symbol number");

            }

        }

        if (a % 2 == 0) {

            System.out.println("Even number ");

        }

//            for (int i = 7; i < 1000; i += 10) {



//            можно просто взять остаток от деления. Число 1007 хоть и 4х значное, но заканчивается на 7ку



        if (a % 10 == 7) {

            System.out.println("Number is ending '7'");
        }

//            }

    }

}