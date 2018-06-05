package test;
public class trainClass {
    public static void main(String[] args) {
        Box y = new Box();
        y.width = 5;
        System.out.println(sq(y) + ":" + y.width);
    }

    static int sq(final Box i){
        Box z = new Box();
        z.width = 10;
        return i.width * ++i.width;
    }

}

class Box {
    int width =5;
}
