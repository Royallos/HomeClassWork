package SecondLesson;
import java.util.Scanner;

//        3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
//        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на10.
//        Вывести полученное число

public class Ex3GD {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");

        int n = scan.nextInt();

        if (n > 0) {

            n += 1;

        } else if (n < 0){

            n -= 2;

        } else if (n == 0) {

            n +=10;
        }

        System.out.println("" + n);

    }

}
