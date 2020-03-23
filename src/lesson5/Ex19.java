package lesson5;

//        Задание 19
//        Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно

public class Ex19 {
    public static void main(String[] args) {

//        Логика в корне неверная. Попробуй на простом предложении,
//        например "one,two,three" или "one,two, three"

        String str = "LoreM ipsu!M dolor sit amet,   consectetur adipiscing elit. Vestibulum vehicula fermentum ligula, dignissim auctor lorem luctus in...";
        char symbol;
        int count = 0;
        str = str.replaceAll("[,.!?;:]", " ");
        String[] words = str.split("\\s+");

        if (str.charAt(0) != ' ') {    //        Chek first word in paragraph
            for (int i = 0; i < words.length; i++) {

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
            System.out.println(count);
        }
    }
}
