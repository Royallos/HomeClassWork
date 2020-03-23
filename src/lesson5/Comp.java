package lesson5;

public class Comp {
    public static void main(String[] args) {

        Computer pc = new Computer();

        int processor = 2100;
        int ram = 8000;
        int hd = 500;
        int cycle = 5;

        pc.show(processor, ram, hd, cycle);
        pc.switchOnOff();

    }
}

