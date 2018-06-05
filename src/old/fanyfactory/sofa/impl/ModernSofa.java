package old.fanyfactory.sofa.impl;

import old.fanyfactory.sofa.Sofa;

public class ModernSofa implements Sofa {
    private boolean transform;
    private String color;

    public ModernSofa(String color, boolean transform){
        this.color = color;
        this.transform = transform;
    }
    public ModernSofa(){
        this("Black",true);
    }

    @Override
    public void print (){
        System.out.println("XoXo i am a Modern sofa!");
    }
    @Override
    public void printColor(){
        System.out.printf("%s",color);
    }

    @Override
    public boolean isTransform(){
        return transform;
    }
}
