package old.fanyfactory.chair.impl;

import old.fanyfactory.chair.Chair;

public class ModernChair implements Chair {

    String color;

    public ModernChair(String color) {
        this.color = color;
    }

    public ModernChair() {
        this("Black");
    }

    @Override
    public void print() {
        System.out.println("wow i am  modern chair");
    }

    @Override
    public void printColor() {
        System.out.printf("%s", color);
    }
}
