package lesson2;
import java.util.Scanner;

//        6) Даны 2 числа. Вывести большее из них

public class Ex6GD {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {

            System.out.println(a);

        } else if (b > a){

            System.out.println(b);

        } else {

            System.out.println("Number is equal");
        }

    }

}
