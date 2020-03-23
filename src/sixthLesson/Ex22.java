package sixthLesson;

//        Задание 22
//        Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//        записаных по правилам Java, с помощью регулярных выражений и вывести их на
//        страницу.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex22 {
    public static void main(String[] args) {

        String s1 = new String();
        s1 = "0x7FFF 0x7ABA asdgq  afdbxa ";

        Pattern pat = Pattern.compile("0x\\p{XDigit}+");
        Matcher m = pat.matcher(s1);

        while(m.find()) {

            System.out.println(m.group());
        }
    }
}