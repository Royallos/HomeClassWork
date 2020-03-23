package ThirdLesson;
import java.util.Scanner;

//        3)Вычислить: 1+2+4+8+...+2564)
//        Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.

public class Ex3GD {

    public static void main(String[] args) {
        
        int sum = 1;
        int num = 1;

        for (int i = 0; i <= 1111110 ; i++) {


            sum = num*2 + sum;
            num *= 2;

            if (num > 2564) {

                break;
            }

        }

        System.out.println("Sum is " + sum);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scan.nextInt();
        System.out.println("Enter number b");
        int b = scan.nextInt();
        int product = 0;

        for (int i = 0; i < b; i++) {

            product += a;
        }
        System.out.println("a*b=" + product);
    }
}
