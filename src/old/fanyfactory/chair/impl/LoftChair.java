package old.fanyfactory.chair.impl;

import old.fanyfactory.chair.Chair;

public class LoftChair implements Chair {

    String color;

   public LoftChair(String color){
        this.color = color;
    }
   public LoftChair(){
        this("Black");
    }

    @Override
    public void print(){
        System.out.printf("wow i am loft %s chair ",color);
    }

    @Override
    public void printColor(){
        System.out.printf("%s \n",color);
    }
}
