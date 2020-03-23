package FourthLesson;

//        Создать класс компьютер.
//        Поля:
//        - процессор
//        - оперативка
//        - жесткий диск
//        - ресурс полных циклов работы (включений/выключений)
//
//        Методы:
//        - метод описание(вывод всех полей)
//        - метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1),
//        вы вводите число с клавиатуры, если угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке
//        включить нужно выдать сообщение что ему конец
//        - выключить (аналогично включению)
//        - при превышении лимита ресурса комп сгорает

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {

        int processor = 2100;
        int ram = 8000;
        int hd = 500;
        int cycle = 5;

        show(processor, ram, hd, cycle);
        switchOnOff();

    }

    static void show(int a, int b, int c, int d) {

        System.out.println("Processor: " + a + "\n Ram: " + b + "\n HD: " + c + "\n Number of operations: " + d);
    }

    static void switchOnOff() {

        for (int i = 2; i < 12; i++) {   // number of iterations less than max value of cycle

            Random rand = new Random();
            int randomNum = rand.nextInt(2);
            if (i % 2 == 0) {
                System.out.println("For switch on enter 0 or 1:");
            } else {

                System.out.println("For switch off enter 0 or 1:");
            }
            Scanner sc = new Scanner(System.in);
            int yourNum = sc.nextInt();

            if (i < 11) {

                if (i % 2 == 0) {

                    if (randomNum == yourNum) {

                        System.out.println("Comp is on.");
                    } else {

                        System.out.println("Your comp has broken!");
                        break;
                    }
                }
                if (i % 2 != 0) {

                    if (randomNum == yourNum) {

                            System.out.println("Comp is off.");
                        } else {

                            System.out.println("Your comp has broken!");
                            break;
                        }
                    }
                } else {

                System.out.println("Your comp has broken!");
                break;
            }
        }
    }
}
