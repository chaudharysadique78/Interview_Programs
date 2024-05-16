package programs;


import java.lang.reflect.Method;

class Test1 {

    private void show(){
        System.out.println("SHOW");
    }

    Test1(){
        System.out.println("Constructor");
    }
}

public class PrivateMethodAcessReflection {

    public static void main(String[] args) throws Exception {

        Test1 t=new Test1();
        Method metod = Test1.class.getDeclaredMethod("show");
        metod.setAccessible(true);
        metod.invoke(t);

    }

}
