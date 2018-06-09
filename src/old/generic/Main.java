package old.generic;

public class Main {
    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(3,5),
                new TwoD(5,10),
                new TwoD(12,4)
        };
      ThreeD thd[] = {
                new ThreeD(23,5, 12),
                new ThreeD(5,10, 4),
                new ThreeD(1,5,14)
        };
      FourD fd[] = {
                new FourD(3,5,12,34),
                new FourD(4,5,6,7),
                new FourD(12,4,5,21)
        };

     Coords <TwoD> tdlocd =  new Coords<>(td);
     Coords <ThreeD> thlo =  new Coords<>(thd);
     Coords <FourD> fourd =  new Coords<>(fd);

     Boom.showXY(tdlocd);
     Boom.showXYZ(thlo);
     Boom.showXYZT(fourd);

    }


}
class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD{
    int z;
    ThreeD (int a,int b, int c){
        super(a,b);
        z = c;

    }

}

class FourD extends ThreeD{
    int t;
    FourD (int a, int b, int c, int d){
        super(a,b,c);
        t = d;
    }
}
class  Coords <T extends TwoD> {
    T[] coords;

    Coords(T coords[]){
        this.coords = coords;
    }
}
class Boom {
    static void showXY (Coords<?> c){
        System.out.println( " let see 2d");
        for (int i = 0; i < c.coords.length ; i++) {

            System.out.println("x = " + c.coords[i].x + " y = "+c.coords[i].y);
        }
    }
    static void showXYZ (Coords<? extends ThreeD> c){
        System.out.println( " let see 3d ");
        for (int i = 0; i < c.coords.length ; i++) {

            System.out.println("x = " + c.coords[i].x + " y = "+c.coords[i].y + " z = "+ c.coords[i].z);
        }
    }
    static void showXYZT (Coords<? extends FourD> c){
        System.out.println( " let see 4d ");
        for (int i = 0; i < c.coords.length ; i++) {

            System.out.println("x = " + c.coords[i].x +
                    " y = "+c.coords[i].y +
                    " z = "+ c.coords[i].z +
                    " t = "+ c.coords[i].t);
        }
    }
}
