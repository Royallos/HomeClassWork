package FourthLesson;

//        Задание 20
//        Имеется строка с текстом. Вывести текст, составленный из последних букв
//        всех слов.

public class Ex20 {
    public static void main(String[] args) {

        String str = "LoreM ipsuM dolor sit amet,     consectetur adipiscing elit. Nunc sagittis mauris arcu, at viverra nulla cursus in! Nunc hendrerit tristique felis - venenatis volutpat. Duis vel massa ac tellus porta hendrerit. Fusce at aliquet lorem, vitae ultrices justo. Aenean eget: semper lorem. Integer bibendum risus lorem, ac facilisis - ipsum sollicitudin vel. Vestibulum vehicula fermentum ligula, dignissim auctor lorem luctus in!";
        char symbol;
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {

                if (str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'z') {

                } else {

                    char tmp = str.charAt(i);
                    newStr += tmp;
                }
            }
        }
        System.out.println(newStr);
    }
}
