package sixthLesson;

//        Задание 24
//        Создать класс и объекты описывающие промежуток времени. Сам промежуток
//        в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//        Сделать методы для получения полного количества секунд в объекте, сравнения
//        двух объектов (метод должен работать аналогично compareTo в строках). Создать
//        два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//        по отдельности. Сделать метод для вывода данных.

public class Ex24_main {

    public static void main(String[] args) {

        Ex24_class obj1 = new Ex24_class(1, 1 , 5);
        Ex24_class obj2 = new Ex24_class(120);

        obj1.timeSec();
        obj2.timeSec();

        obj1.show();
        obj2.show();




    }
}
