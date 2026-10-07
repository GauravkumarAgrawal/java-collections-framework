package allcollectionsexamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        List<String> s = new LinkedList<String>();
        s.add("banana");
        s.add("mango");s.add("apple");s.add("pine");

        System.out.println(s);

        ls.add(1);
        ls.add(1);
        ls.add(1);
        ls.add(1);

        System.out.println(ls);

        System.out.println(s.contains("banana"));
        System.out.println(s);

        int index = s.indexOf("pine");
        System.out.println(index);

        ls.add(1,2);
        System.out.println(ls);
        ls.set(1,3);
        System.out.println(ls);

        ls.addFirst(10);
        ls.addLast(20);
        System.out.println(ls);

        System.out.println( ls.getFirst());
        System.out.println(ls.getLast());

        System.out.println(ls.get(1));
        System.out.println("=================================");
        ls.forEach(ele ->System.out.println(ele));

       ls.clear();
        System.out.println(ls);

        System.out.println("=================Iterator================");
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String sss =(String) iterator.next();
            System.out.println(sss);
        }
        System.out.println("================lambda=================");
        s.forEach(ele-> System.out.println(ele));

        System.out.println("==================for===============");

        for(String s1:s){
            System.out.println(s1);
        }
    }
}
