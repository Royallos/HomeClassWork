package ThirdLesson;

//        7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99


public class Ex6GD {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <100 ; i++) {

            if (i %2 > 0) {

                sum = sum + i;
            }
        }

        System.out.print("Sum is " + sum);
    }
}