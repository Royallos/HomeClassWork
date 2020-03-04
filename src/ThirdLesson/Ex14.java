package ThirdLesson;
import java.util.Arrays;
import java.util.Random;

//        Задание 14
//        Создать массив оценок произвольной длины, вывести максимальную и
//        минимальную оценку, её (их) номера.

public class Ex14 {
    public static void main(String[] args) {

        int [] marks = new int[15];
        int [] markPlace = new int[15];
        Random rand = new Random();
        int maxMark = 0;
        int maxMarkIndex = 0;
        int counter = 0;

//        Fill the array

        System.out.println("Our marks' array is:");

        for (int i = 0; i < marks.length; i++) {

            marks[i] = rand.nextInt(10);
            System.out.print(marks[i] + " "  );
        }
        System.out.print("\n");

//        Find max value

        for (int i = 0; i < marks.length - 1; i++) {

            if (marks[i] > marks[maxMarkIndex]) {

//             (marks[i] < marks[minMarkIndex])  <---   For searching min value (2 half of task)

                maxMarkIndex = i;
                maxMark = marks[maxMarkIndex];
            }
        }

        for (int i = 0; i < marks.length; i++) {

            if (maxMark == marks[i]) {

                counter++;
            }
        }

        if(counter > 1) {

            System.out.print("The best mark is " + maxMark + ". Her place are ");

            for (int i = 0; i < marks.length; i++) {

                if (maxMark == marks[i]) {

                    System.out.print((i + 1) + " ");
                }
            }
        } else {

            System.out.print("The best mark is " + maxMark + ". Her place is ");

            for (int i = 0; i < marks.length; i++) {

                if (maxMark == marks[i]) {

                    System.out.print((i + 1) + " ");
                }
            }
        }
    }
}
