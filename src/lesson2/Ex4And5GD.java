package lesson2;
import java.util.Scanner;

//        4) Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.
//        5) Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
public class Ex4And5GD {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

//        больше бы подошли 3 if - else (c)

        if (a >= 0) {

            System.out.println("Num " + a + " is positive");
        } else {

            System.out.println("Num " + a + " is negative");
        }

        if (b >= 0) {

            System.out.println("Num " + b + " is positive");
        } else {

            System.out.println("Num " + b + " is negative");
        }
        if (c >= 0) {

            System.out.println("Num " + c + " is positive");
        } else {

            System.out.println("Num " + c + " is negative");
        }

    }

}