package ThirdLesson;
import java.util.Arrays;
import java.util.Random;

//        Задание 15
//        Создать массив, заполнить его случайными элементами, распечатать,
//        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//        еще один массив).

public class Ex15 {

    public static void main(String[] args) {

        int[] arr = new int[15];
        Random rand = new Random();

//        Fill and print the array

        System.out.println("Our array is");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");
        }

//        Reverse and print the array


        System.out.println("Reverse array is");

        for (int i = 0; i <= (arr.length/2); i++) {

            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        String arrString = Arrays.toString(arr);
        System.out.print(arrString + " ");
    }
}
