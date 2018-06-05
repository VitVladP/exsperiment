package tests;

import java.util.HashMap;
import java.util.List;

public class SomeClassA {
   static {
       System.out.println("bugaga");
   }
    static String test = "static perem";

    public void print (){

        System.out.println(" parent ");
    }

    class myHashMap<K,V> extends HashMap<K,List<V>>{


        @Override
        public List<V> put(K key, List<V> value) {
            return super.put(key, value);
        }
    }
}
