package sixthLesson;

//        Задание 23
//        Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//        которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//        абзацев <p>.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex23 {
    public static void main(String[] args) {

        String s1 = new String();

        s1 = "0x7FFF <p id=”p1”> 0x7ABA  asdgq <p>  afdbxa ";

        System.out.println(s1.replaceAll("<p> | <p id=”p1”>", " <p>"));
    }
}
