package sixthLesson;

//      2) Заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0

public class Ex2GD {
    public static void main(String[] args) {

        String str = new String("Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции");
        String newString = new String("");

        newString = str.replace(str.charAt(3), str.charAt(0));
        System.out.println(newString);
    }
}
