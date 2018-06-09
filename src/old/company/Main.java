package old.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

          workWithList();
          workwithSeparator();
        workHashMap();
        wlinkedList();
    }

    public static void wlinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        list.add(-20);
        list.add(8);
        list.add(20);
        list.add(17);
        list.add(-8);
        list.add(13);
        list1.add(3);
        list1.add(5);
        list.addAll(list1);
        System.out.println(Collections.addAll(list,3,4,7));
        Comparator<Integer> comp = Collections.reverseOrder();
        Collections.sort(list, comp);
       soutlist(list);

        Collections.sort(list);
        soutlist(list);

        Collections.shuffle(list);
        int count = Collections.frequency(list, 3);
        System.out.println(count);
    }
    public static void soutlist (LinkedList<Integer> list){
        for (Integer i: list
                ) {
            System.out.print(i.toString()+"; ");
        }
        System.out.println();
    }
    public static void workHashMap(){
        HashMap<String,Double> mapa = new HashMap<>();

        mapa.put("Stiw", 2000.);
        mapa.put("Andru", 1000.);
        mapa.put("dude", 3000.);
        mapa.put("Surfer", 10000.);

        for (Map.Entry<String,Double> entry : mapa.entrySet())
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        Double balance  = mapa.get("dude");
        balance += 10000;
        mapa.put("dude", balance);
        mapa.put("Surfer", mapa.get("Surfer")+1000);
        System.out.println("changes Surfer :" + mapa.get("Surfer"));
    }

    public static void workwithSeparator(){

        ArrayList<Double> list = new ArrayList<>();
        list.add(4.0);
        list.add(2.0);
        list.add(8.0);
        list.add(9.0);

        System.out.println("вывод листа ");
        Spliterator<Double> split = list.spliterator();


        while (split.tryAdvance(System.out::println)) {
            System.out.println();
        }

        split = list.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while (split.tryAdvance((n)->sqrt.add(Math.sqrt(n))));

        System.out.println("foreach ");

        split = sqrt.spliterator();
        split.forEachRemaining((n)-> System.out.println(n));


    }

    public static void workWithList(){
    List<String> list = new LinkedList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test2");

    ListIterator<String> it = list.listIterator(2);
    String str1 = "bygaga";
   // it.set(str1);
        it.add("ich");
        it.add("dude");
        while (it.hasNext())
                System.out.println(it.next());

        System.out.println("------------------");
        list.add(2,"demo");
        list.remove("test2");
        for (String str : list)
            System.out.println(str);
    }
}
