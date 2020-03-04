package ThirdLesson;

//        6)Напишите программу вывода всех четных чисел от 2 до 100 включительно


public class Ex5GD {

    public static void main(String[] args) {

        for (int i = 1; i <101 ; i++) {

            if (i %2 == 0) {

                System.out.print(i + " ");
            }

        }
    }
}
