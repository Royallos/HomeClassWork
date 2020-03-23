package Lesson3;

//        2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//        Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.


public class Ex2GD {

    public static void main(String[] args) {

        int newAmeba = 1;
        int time = 0;

        for (int i = 0; i < 8; i++) {

            newAmeba *= 2;
            time += 3;

            System.out.println(newAmeba + " new Ameb are after " + time + " hours");
        }
    }
}
