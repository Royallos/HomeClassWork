package ThirdLesson;

//        Задание 12
//        Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();

        for (int i = 1; i < 10; i++) {

            if ((num + i) % 3 == 0) {

                sum += (num + i);
            }

        }

        System.out.println("Sum is :" + sum);
    }

}
