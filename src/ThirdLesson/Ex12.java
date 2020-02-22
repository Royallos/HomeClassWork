package ThirdLesson;

//        Задание 12
//        Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        int sum = 0;

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number");
//        int num = scan.nextInt();
//
//        for (int i = 1; i < 10; i++) {
//
//            if ((num + i) % 3 == 0) {
//
//                sum += (num + i);
//            }
//
//        }
//
//        System.out.println("Sum is :" + sum);



//        Не верно. Попробуй посчитать сумму первых 3х чисел (должно получиться 18)

//        Моя программа считала сумму первых 3х чисел которые делятся 3 без остатка
//        начиная от введенного числа. Т.е. если вводите (6||7||8) -- она сложит 9+12+15...
//        Если я ввожу (0||1||2) выводит 18

        for (int i = 1; i < 10; i++) {

            if (i % 3 == 0) {

                sum += i;
            }

        }

        System.out.println("Sum is :" + sum);

    }

}
