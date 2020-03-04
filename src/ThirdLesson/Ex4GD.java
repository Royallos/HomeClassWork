package ThirdLesson;

//          Напишите программу печати таблицы перевода расстояний из дюймов всантиметры
//          для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Ex4GD {

    public static void main(String[] args) {
        int duim = 0;
        double [][] table = new double[20][2];

        for (int i = 1; i <table.length ; i++) {
            for (int j = 0; j < (table[i].length - 1); j++) {

                table[i][j] = i * 2.54;
                duim++;

                System.out.print(duim + " duim = " + table[i][j] + "cm" + "\t");
            }
            System.out.println();
        }
    }
}
