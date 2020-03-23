package Lesson3;

//        Задание 10
//        Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Ex10 {

    public static void main(String[] args) {

        int a = 15;
        int f = 1;
        for (int i = 10; i < 16; i++) {

            f *= i;
        }

        System.out.println("Factorial: "+ f);

    }

}