package sixthLesson;

//        1) Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции
//        до последнего вхождения другого символа на произвольной позиции.
//        Первый символ должен быть выбран рандомно из первой половины предложения,
//        второй - из второй. Если символы совпадают, генерировать пары, пока символы не будут различны.

import java.util.Random;

import static java.lang.Math.random;

public class Ex1GD {
    public static void main(String[] args) {

        String str = new String("Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции");
        String newString = new String("");
        Random rand = new Random();
        int firstSymbol = 0;
        int secondSymbol = 0;
        int newFirst = 0;
        int newLast = 0;

        for (int i = 0; i < 100; i++) {

            firstSymbol = rand.nextInt(str.length()/2);
            secondSymbol = rand.nextInt((str.length() / 2) * 2);
            if (str.charAt(firstSymbol) != str.charAt(secondSymbol)) {
                System.out.println(str.charAt(firstSymbol) + " " + str.charAt(secondSymbol));
                break;
            }
        }
        newFirst = str.indexOf(str.charAt(firstSymbol));
        newLast = str.lastIndexOf(str.charAt(secondSymbol));

        System.out.println(newFirst + " " + newLast);

        newString = str.substring(newFirst, newLast);

        System.out.println(newString);
    }
}
