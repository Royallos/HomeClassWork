package Lesson3;

//        Задание 9
//        Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//        произведение, т.е. факториал числа.

public class Ex9 {

    public static void main(String[] args) {

        double sum = 0;
        double avg = 0;
        int n = 0;
        int f = 1;
        Math math = null;
        int x = (int) (math.random() * 5);

        while (x != 0) {

            for (int i = 1; i <= x; i++) {   //цикл для расчета факториала

                f *= i;
            }

            sum += f;  // "Расчитывается не сумма, а произведение, т.е. факториал числа. (если я правильно понял задание)
            n++;
            f = 1;
            x = (int) (math.random() * 5);
        }

        if (n != 0) {

            avg = sum / n;

        } else {

            avg = 0;

        }
        System.out.println("Avg: "+ avg + " Sum: " + sum + " Amount of numbers: " +  n);

    }

}