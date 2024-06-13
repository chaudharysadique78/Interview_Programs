package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Key{
    String s;

    public Key(String s){
        this.s=s;
    }

    @Override
    public String toString() {
        return this.s;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
}

public class WeakHashMapTest {

    public static void main(String[] args) {

        Map map = new WeakHashMap();
        Map hashMap=new HashMap();

       Key k1=new Key("Sadik");
       Key k2=new Key("Sadan");

       map.put(null,1);
       map.put(k1,2);
       map.put(k2,3);
       map.put(k2,5);

        /*hashMap.put(null,1);
        hashMap.put(k1,2);
        hashMap.put(k2,3);*/



        map.forEach((k, v) -> System.out.println("WeakMap: "+k + " " + v));
        hashMap.forEach((k, v) -> System.out.println("HashMap: "+k + " " + v));

        k1=null;

        System.gc();

        System.out.println("After gc");

        map.forEach((k, v) -> System.out.println("WeakMap: "+k + " " + v));
        hashMap.forEach((k, v) -> System.out.println("HashMap: "+k + " " + v));

    }


}


