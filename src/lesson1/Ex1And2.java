package lesson1;
import java.util.Scanner;

//        Задание 1
//        Набрать приведенный пример, откомпилировать его и запустить.
//        Задание 2
//        Изменить данный пример так, что бы при запуске программы ваша программа
//        выводила следующее: “Hello, <Ваше имя>!”.


public class Ex1And2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scan.nextLine();

        System.out.println("Hello " + name);

        scan.close();
    }

}