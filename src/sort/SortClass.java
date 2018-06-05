package sort;

import java.util.concurrent.Callable;




public class SortClass {
    private String string;
    private SortImpl sort;

    public SortClass(String string) {
        this.string = string;
        this.sort =  new SortImpl();
    }

    public String reverceString (){

        return string;
    }
    public class SortImpl implements Callable<String> {
    @Override
    public String call() throws Exception {

        return string;
    }
}
}
