package allcollectionsexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List Allows duplicate / multiple empty / multiple null
        //insertion order is preserve
        list.add("");
        list.add(null);
        list.add("");
        list.add(null);
        list.add("");
        list.add(null);
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element3");
        System.out.println("=========================");
        System.out.println(list);
        list.forEach(e ->System.out.println(e));
        System.out.println(list.get(3));
        System.out.println(list.get(00));
        System.out.println("=========================");

        List<String> fruits = new ArrayList<>(15);
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("pine");
        fruits.add("apple");
        System.out.println("==========foreach===============");
        fruits.forEach(e->System.out.println(e));

        System.out.println("===========loop==============");
        for(String s: fruits){
            System.out.println(s);
        }
        System.out.println("===========iterator for ==============");

        for(Iterator iterator = fruits.iterator();iterator.hasNext();){
            String fruit = (String) iterator.next();
            System.out.println(fruit);
        }
        System.out.println("===========iterator while==============");
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            String fruit = (String) iterator.next();
            System.out.println(fruit);
        }
        System.out.println("===========iterator==============");

        //add to index the element
        fruits.add(4,"oooo");
        //set to replace the element
        fruits.set(2,"ggggg");
        System.out.println("=================java 8 for each =================");
        fruits.forEach(e->System.out.println(e));
        System.out.println("=========================");

        System.out.println("=================java 8 Stream ang lambda=================");
        fruits.stream().forEach(element ->System.out.println(element));
        System.out.println("======================================================");

        List<String> subFrunits = new ArrayList<String>();
        subFrunits.add("pine");
        subFrunits.add("apple");
        System.out.println("new Fruits list "+subFrunits);

        subFrunits.remove(0);
        System.out.println(subFrunits);
        System.out.println("=========================");
        fruits.removeAll(subFrunits);
        System.out.println("=========================");
        System.out.println(fruits);
        System.out.println("=========================");


        //How to add all the elements from existing collections to new
        //addall() method

        //add 5 prime numbers
        List<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(3);
        num.add(5);
        num.add(7);
        num.add(11);
        //pass existing collection to another collection
        List<Integer> num2 = new ArrayList<>(num);
        //add another collection
        List<Integer> num3 = new ArrayList<>();
        num3.add(29);
        num3.add(13);
        num3.add(17);
        num3.add(19);
        num3.add(23);

        //addAll collection
        num2.addAll(num3);

        System.out.println(num2);

        //num2.forEach(ele ->System.out.println(ele));

        // How to check if an ArrayList is empty using the isEmpty () method.
        //How to find the size of an ArrayList using the size () method.
        //How to access the element at a particular index in an ArrayList using the get () method.
        //How to modify the element at a particular index in an ArrayList using the set () method.

        System.out.println(num2.isEmpty());
        System.out.println(num2.size());
        System.out.println(num2.get(8));
        System.out.println(num2.remove(8));
        num2.add(8,17);
        num2.set(8,12);
        System.out.println("==========================");
        System.out.println(num2);

    }
}
