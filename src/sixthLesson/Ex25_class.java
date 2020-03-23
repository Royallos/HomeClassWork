package sixthLesson;

//        Задание 25
//
//        На вход передается сумма денег. На выход – булевское
//        значение (операция удалась или нет). При снятии денег функция должна
//        рапечатывать каким количеством купюр какого номинала выдается сумма.
//


public class Ex25_class {
    int papper20 = 0;
    int papper50 = 0;
    int papper100 = 0;
    int m20 = 0;
    int m50 = 0;
    int m100 = 0;
    boolean result = true;

    public Ex25_class(int c20, int c50, int c100) {

        this.papper20 = c20;
        this.papper50 = c50;
        this.papper100 = c100;
    }

    public void add(int c20, int c50, int c100) {

        this.papper20 += c20;
        this.papper50 += c50;
        this.papper100 += c100;
    }

    public void give(int c20, int c50, int c100) {

        this.papper20 += c20;
        this.papper50 += c50;
        this.papper100 += c100;
    }

    public void moneyGet(int moneyValue) {

        int a100 = moneyValue / 100;
        int a50 = (moneyValue % 100) / 50;
        int a20 = ((moneyValue % 100) % 50) / 20;

        if (a100 * 100 + a50 * 50 + a20 * 20 == moneyValue) {

            if (a100 <= papper100) {
                if (a50 <= papper50) {
                    if (a20 <= papper20) {
                        papper20 -= a20;
                        papper50 -= a50;
                        papper100 -= a100;
                        m20 = a20;
                        m50 = a50;
                        m100 = a100;
                        System.out.println("Take your money");
                        result = true;


                    } else {
                        System.out.println("Terminal havent got money enought");
                        result = false;
                    }
                }
            } else {
                a50 = a50 + (a100 * 2);
                if (a50 <= papper50) {
                    if (a20 <= papper20) {
                        papper20 -= a20;
                        papper50 -= a50;
                        m20 = a20;
                        m50 = a50;
                        m100 = 0;
                        System.out.println("Take your money");
                        result = true;
                    } else {
                        System.out.println("Terminal havent got money enought");
                        result = false;
                    }
                } else {
                    System.out.println("Terminal havent got money enought");
                    result = false;
                }
            }
        } else {

            System.out.println("Enter correct sum");
            result = false;
        }

    }
    public void show() {

        System.out.println("papper20:" + m20 + "papper50:" + m50 + "papper100:" + m100 );
    }
}
