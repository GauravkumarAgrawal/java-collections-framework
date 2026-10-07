package allcollectionsexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(60);
        set.add(80);

//        for (Integer i : set) {
//            System.out.println(i);
//        }


        System.out.println("===========For loop iterator=======");

        for(Iterator<Integer> iterator = set.iterator(); iterator.hasNext();){
            int count = iterator.next();
            System.out.println(count);
        }

        System.out.println("===========While loop iterator=======");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int count =  iterator.next();
            System.out.println(count);
        }
        System.out.println("===========lambda iterator=======");
        set.forEach(ele -> System.out.println(ele));
        //remove anyt element from set
        System.out.println("===========Stream iterator=======");
        set.stream().filter(s ->10!=(s)).forEach(s-> System.out.println(s));




    }
}
