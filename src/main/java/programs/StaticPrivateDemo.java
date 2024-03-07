package programs;

public class StaticPrivateDemo {
    int a=10;
    static  int b=30;

    private static void privateShow(){
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        StaticPrivateDemo h=new StaticPrivateDemo();
        h.privateShow();
        StaticPrivateDemo.privateShow();
        System.out.println(b);
        System.out.println(h.a);

    }

}


class Test{
    public static void main(String[] args) {
        StaticPrivateDemo h=new StaticPrivateDemo();
        // we can't use private method outside class
       // h.privateShow();
        System.out.println(h.a);
    }
}
