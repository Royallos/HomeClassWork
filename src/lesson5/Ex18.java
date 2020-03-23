package lesson5;

//        Задание 18
//        Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//        общее их количество.

public class Ex18 {
    public static void main(String[] args) {

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sagittis mauris arcu, at viverra nulla cursus in! Nunc hendrerit tristique felis - venenatis volutpat. Duis vel massa ac tellus porta hendrerit. Fusce at aliquet lorem, vitae ultrices justo. Aenean eget: semper lorem. Integer bibendum risus lorem, ac facilisis - ipsum sollicitudin vel. Vestibulum vehicula fermentum ligula, dignissim auctor lorem luctus in!";
        int count = 0;
        char symbol;

        for (int i = 0; i < str.length(); i++) {

            symbol = str.charAt(i);

            if (symbol == ',' || symbol == '.' || symbol == ';' || symbol == ':' || symbol == '-' || symbol == '!' || symbol == '?') {

                count++;
            }
        }
        System.out.println("Total: " + count);
    }
}