package Lesson3;

// Бабочка

public class Ex17 {
    public static void main(String[] args) {
        int [][] array = new int[7][7];

//      Fill the array

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = 1;
            }
        }

//        Top left half

        for (int i =1; i < (array.length/2 + 1); i++) {
            for (int j = 0; j < i ; j++) {

                array[i][j] = 0;
            }
        }

//        Top right half


        for (int i =1; i < (array.length/2 + 1); i++) {
            for (int j = (array[i].length - 1); j > (array[i].length - i - 1) ; j--) {

                array[i][j] = 0;
            }
        }

//        Bot left half

        for (int i =(array.length/2 + 1); i < array.length; i++) {
            for (int j = 0; j < (array[i].length - i - 1) ; j++) {

                array[i][j] = 0;
            }
        }

//        Bot right half

        for (int i =(array.length/2 + 1); i < array.length; i++) {
            for (int j = array[i].length - 1; j > i ; j--) {

                array[i][j] = 0;
            }
        }

//        Print

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }
}

