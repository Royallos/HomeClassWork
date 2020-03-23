package Lesson3;

//        1)Начав тренировки, спортсмен в первый день пробежал 10 км.
//         Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня
//         Какойсуммарный путь пробежит спортсмен за 7 дней?


public class Ex1GD {
    public static void main(String[] args) {

        double sum = 10;

        for (int i = 0; i < 7; i++) {

            sum = sum*1.1;
        }

        System.out.println("He ran " + sum + "km on 7th day");
    }
}