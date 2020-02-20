package SecondLesson;
import java.util.Scanner;

//        2) Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей.
//        Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
//        Требуется сравнить длину каждогоотрезка-стороны с суммой двух других.
//        Если хотя бы в одном случае отрезококажется больше суммы двух других,
//        то треугольника с такими сторонами несуществует.

public class Ex2GD {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sides:");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a + b > c && a + c > b && b + c > a) {

            System.out.println("This triangle is exist");

        } else {

            System.out.println("This triangle does not exist");

        }

    }

}
