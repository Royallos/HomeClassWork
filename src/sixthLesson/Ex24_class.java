package sixthLesson;


//        Сделать методы для сравнения
//        двух объектов (метод должен работать аналогично compareTo в строках).



//public class Ex24_class implements Comparable <Ex24_class> {
public class Ex24_class {

    int sec = 0;
    int min = 0;
    int hour = 0;

    public Ex24_class(int hour, int min, int sec) {

        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
//    @Override
//    public int compareTo(Ex24_class o) {

//        int result = this.hour.compareTo(o.hour);

//        return result;

//}
    public Ex24_class(int sec) {

        this.sec = sec;
    }
    public int timeSec() {

        int timeSec = this.hour*3600 + this.min*60 + this.sec;

        System.out.println(timeSec);
        return timeSec;
    }
    public void show() {

        System.out.println(this.hour + " H " + this.min + " M " + this.sec + " S");
    }

}
