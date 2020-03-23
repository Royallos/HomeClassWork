package sixthLesson;

//        Задание 21
//        Напишите три цикла выполняющих многократное сложение строк, один с
//        помощью оператора сложения и String, другой с помощью StringBuilder и метода
//        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

public class Ex21 {
    public static void main(String[] args) {

        String s1 = new String("Abc");
        String stringResult = new String(s1);
        StringBuffer bufferResult = new StringBuffer(s1);
        StringBuilder builderReslt = new StringBuilder(s1);

        long startTime = System.nanoTime();
        for (int i = 0; i < 30; i++) {

            stringResult += s1;
        }
        long finishTime = System.nanoTime() - startTime;

        System.out.println("Time for string: " + finishTime);

        long startTime2 = System.nanoTime();
        for (int i = 0; i < 30; i++) {

            bufferResult.append(s1);
        }
        long finishTime2 = System.nanoTime() - startTime2;

        System.out.println("Time for buffer: " + finishTime2);

        long startTime3 = System.nanoTime();
        for (int i = 0; i < 30; i++) {

            builderReslt.append(s1);

        }
        long finishTime3 = System.nanoTime() - startTime3;
        System.out.println("Time for builder: " + finishTime3);


    }
}
