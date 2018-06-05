package com.generic;

public class Gen <T> {
    private T obj;
    public Gen( T obj){
        this.obj = obj;
    }
    T getObj(){
        return obj;
    }

    void showType (){
        System.out.println("Типом Т является " + obj.getClass().getName());
    }
}
