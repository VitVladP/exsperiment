package com.equalsAnDhash;

public class Main {
    public static void main(String[] args) {
        TestEquals obj1 = new TestEquals("Pety",1000);
        TestEquals obj2 = new TestEquals("Petr",1000);
        MyEquals obj3 = new MyEquals("Petr",1000,10);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
    }
}
