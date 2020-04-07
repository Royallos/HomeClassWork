package lesson8.cosmos;

public class Cosmodrom {

        public void startShattle(IStart obj) {

             if (obj.beforeStart()) {

                 System.out.println("Ok");
                 obj.startEngine();
                 obj.start();
             }
        }
}

