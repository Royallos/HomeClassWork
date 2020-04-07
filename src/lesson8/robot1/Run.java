package lesson8.robot1;

import lesson8.robot1.hands.IHand;
import lesson8.robot1.hands.SamsungHand;
import lesson8.robot1.hands.SonyHand;
import lesson8.robot1.hands.ToshibaHand;
import lesson8.robot1.heads.IHead;
import lesson8.robot1.heads.SamsungHead;
import lesson8.robot1.heads.SonyHead;
import lesson8.robot1.heads.ToshibaHead;
import lesson8.robot1.legs.ILeg;
import lesson8.robot1.legs.SamsungLeg;
import lesson8.robot1.legs.SonyLeg;
import lesson8.robot1.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        int maxPrice = 0;
       
        IHead samsungHead = new SamsungHead(20);
        IHead sonyHead = new SonyHead(25);
        IHead toshibaHead = new ToshibaHead(15);

        IHand samsungHand = new SamsungHand(15);
        IHand sonyHand = new SonyHand(5);
        IHand toshibaHand= new ToshibaHand(15);

        ILeg samsungLeg = new SamsungLeg(10);
        ILeg sonyLeg = new SonyLeg(5);
        ILeg toshibaLeg = new ToshibaLeg(5);

        Robot robot1 = new Robot(sonyHead, samsungHand, toshibaLeg);
        Robot robot2 = new Robot(sonyHead, sonyHand, samsungLeg);
        Robot robot3 = new Robot(toshibaHead, toshibaHand, samsungLeg);

        robot1.action();
        System.out.println("***");
        robot2.action();
        System.out.println("***");
        robot3.action();
        System.out.println(robot1.getPrice() + " " + robot2.getPrice() + " " + robot3.getPrice());

        Robot [] robots = new Robot[] {robot1, robot2, robot3};
        
            for (int i = 0; i < robots.length - 1; i++) {
                if (robots[i + 1].getPrice() > robots[0].getPrice()) {
                    maxPrice = robots[i + 1].getPrice();
                }else{
                    maxPrice = robots[0].getPrice();
                }
            }
        System.out.println("The most expensive robot costs " + maxPrice);

    }
}
