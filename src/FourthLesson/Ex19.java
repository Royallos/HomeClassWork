package FourthLesson;

//        Задание 19
//        Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//        текста также могут быть пробелы, но могут и отсутствовать.

public class Ex19 {

    public static void main(String[] args) {

        String str ="Lorem ipsum dolor sit amet,     consectetur adipiscing elit. Nunc sagittis mauris arcu, at viverra nulla cursus in! Nunc hendrerit tristique felis - venenatis volutpat. Duis vel massa ac tellus porta hendrerit. Fusce at aliquet lorem, vitae ultrices justo. Aenean eget: semper lorem. Integer bibendum risus lorem, ac facilisis - ipsum sollicitudin vel. Vestibulum vehicula fermentum ligula, dignissim auctor lorem luctus in!";
        char symbol;
        int count = 0;

        if (str.charAt(0) != ' ' ) {    //        Chek first word in paragraph

            count++;
        }

        for (int i = 0; i < str.length(); i++) {

            symbol = str.charAt(i);


            if (symbol == ' ' || symbol == '\n') {

                if (str.charAt(i + 1) != ' ') {

                    count++;
                }
            }
        }
        System.out.println("Total: " + count);
    }
}