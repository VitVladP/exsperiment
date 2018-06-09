package old.SomeCollections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        ArrayList<String> arrList = new ArrayList<>();
        Map<String,String> mapa = new HashMap<>();
        Map<Integer,Integer> mapa1 = new HashMap<>();
        mapa.put(null,"dude");
        mapa.put(null,"surfer");
        mapa.put("dude","surfer");
        mapa.put("vet","surfer");
        mapa.put(null,null);
        System.out.println(mapa1.put(3,6));

        arrList.add("Vet");
        arrList.add("Surfer");
        arrList.add("Dude");
        arrList.add("еще кто-то");
        arrList.add(null);
        arrList.add("Start");
        System.out.println(arrList.size());
        mySet.addAll(arrList);
        System.out.println(mySet);
        System.out.println(arrList);
        for (Map.Entry element:
             mapa.entrySet()) {
            System.out.println(element.getKey() + " : " + element.getValue());
        }
    }
}
