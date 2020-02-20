package ThirdLesson;
import java.util.Scanner;

//        Задание 7
//        Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.


public class Ex7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side a, b and radius");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if ((a*a+b*b) <= ((c*c)*2)) {

            System.out.println("U can cover a hole");

        } else {

            System.out.println("U can't cover a hole");
        }

    }

}
