package Lesson3;
import java.util.Random;

//        Задание 13
//        Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них.

public class Ex13 {
    public static void main(String[] args) {

        int [] arr = new int[15];
        Random rand = new Random();
        int maxIndex = 0;
        int max = 0;

//        Fill the array

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(25);
            System.out.print(arr[i] + " "  );
        }
        System.out.print("\n");

//        Find max value

        for (int i = 0; i < arr.length; i++)

            if (arr[i] > arr[maxIndex]) {

                maxIndex = i;
                max = arr[maxIndex];

            }
        System.out.print("Max value is " + max);

    }
}