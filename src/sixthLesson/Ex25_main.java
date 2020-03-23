package sixthLesson;

//        Задание 25
//        Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//        банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//        50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//        снимающую деньги. На вход передается сумма денег. На выход – булевское
//        значение (операция удалась или нет). При снятии денег функция должна
//        рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//        конструктор с тремя параметрами – количеством купюр.

public class Ex25_main {
    public static void main(String[] args) {

        Ex25_class term = new Ex25_class(10, 10, 10);
        Ex25_class term2 = new Ex25_class(10, 10, 10);

        System.out.println(term.papper20 + " " + term.papper50 + " " + term.papper100);
        term.add(20, 0, 0);
        System.out.println(term.papper20 + " " + term.papper50 + " " + term.papper100);


        term.moneyGet(170);
        System.out.println(term.papper20 + " " + term.papper50 + " " + term.papper100);

    }
}
