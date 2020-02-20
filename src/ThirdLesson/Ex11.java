package ThirdLesson;
import java.util.Scanner;

//        Задание 11
//        Имеется целое число, определить является ли это число простым, т.е.
//        делится без остатка только на 1 и себя.

public class Ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");

        int num = scan.nextInt();
        boolean compound = false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                compound = true;

                break;
            }

        }

        if (compound) {

            System.out.println("It is compound number");

        } else {

            System.out.println("It is prime number");

        }

    }

}
