package Lesson3;

//        Задание 16
//        Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.

import java.util.Random;

public class Ex16 {

    public static void main(String[] args) {

        int[] arr = new int[15];
        Random rand = new Random();
        int min = 0;
        int max = 0;
        int sum = 0;

//        Fill the array

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[max]) {

                max = i;
            }

            if (arr[i] < arr[min]) {

                min = i;
            }
        }

        if (min > max) {

            for (int i = max + 1; i <= min - 1; i++) {

                sum += arr[i];
            }
        } else {

            for (int i = min + 1; i <= max - 1; i++) {

                sum += arr[i];

            }
        }
        System.out.println( "\n Sum is " + sum);
    }
}
