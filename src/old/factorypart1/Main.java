package old.factorypart1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer my[] = {4,6,7,8,9,4,32,1,45,3};
        Service.sortMyArray(my,"RANDOM");
        System.out.println(Arrays.toString(my));
    }
}
