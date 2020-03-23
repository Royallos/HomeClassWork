package lesson5;
//        Задание 20
//        Имеется строка с текстом. Вывести текст, составленный из последних букв
//        всех слов.

public class Ex20 {
    public static void main(String[] args) {

//        Логика неверная
//        str.charAt(i+1) - всегда будет ошибку выдавать на последнем символе

        String str = "LoreM ipsuM dolor sit amet, consectetur adipiscing elit. Vestibulum vehicula fermentum ligula, dignissim auctor lorem luctus in";
        char symbol;
        String newStr = "";

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {

                if (str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'z') {

                } else {

                    char tmp = str.charAt(i);
                    newStr += tmp;
                }
            }
        }
        if (str.charAt(str.length() - 1) >= 'A' && str.charAt(str.length() - 1) <= 'z') {   // Chek punctuation mark in ending of sentense


            newStr += str.charAt(str.length() - 1);
        }
        System.out.println(newStr);
    }
}
