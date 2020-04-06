package lesson9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@interface Version {

    String name();
    String classVersion();
}
@Version(name = "Abc", classVersion = "7.2")

public class MyService {

    private int a;
    private String b;

    public static void checkAnna() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void thisClassInfo() {

        System.out.println(a + " " + b);
    }
    static void checkAnna(Class<?>serviceClass) {

        if(serviceClass.isAnnotationPresent(Version.class)) {

            MyService service = new MyService();
            service.setA(5);
            service.setB("7");
            service.thisClassInfo();
        } else {
            System.out.println("Hr");
        }
    }
    @Override
    public boolean equals(Object obj) {

        if (this==obj){
            return true;
        }
        if (obj==null || this.getClass()!=obj.getClass())
            return false;
        MyService o = (MyService) obj;
        return a == o.a && b.equals(o.b);

    }
}

