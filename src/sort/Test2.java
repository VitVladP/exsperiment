package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
           String s = reader.readLine();
            System.out.println(reversByMerge(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String reversByMerge(String s) throws ExecutionException, InterruptedException {
        if (s.length() < 2) return s;
        int middle = s.length() / 2;
        return reversByMerge(s.substring(middle))+reversByMerge(s.substring(0,middle));

    }

//    static class MyPool implements Callable<String> {
//        private String str;
//
//        public void setStr(String str) {
//            this.str = str;
//        }
//
//        @Override
//        public String call() throws Exception {
//            String result = reversByMerge(str);
//            return result;
//        }
//    }
}