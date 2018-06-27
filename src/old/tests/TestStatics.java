package old.tests;

import com.ThreeCollections.ClassA;

import java.util.ArrayList;
import java.util.List;

public class TestStatics {
    public static void main(String[] args) {
       // SomeClassA.print();
        System.out.println(SomeClassA.test);
        System.out.println(SomeClassB.test);
        SomeClassA a = new SomeClassA();
        SomeClassB b = new SomeClassB();
        SomeClassA c = new SomeClassA();
        a.print();
        System.out.println(a.test);
        System.out.println(b.test);
        List<Object> objects = new ArrayList<>();
        objects.add(new SomeClassA());
        SomeClassA t = (SomeClassA) objects.get(0);
        t.print();
     // SomeClassB b = new SomeClassB();
      b.print();
    }

}
