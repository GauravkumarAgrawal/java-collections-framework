package allcollectionsexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CoillectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection= new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("apple");
        fruitCollection.add("apple");
        fruitCollection.add("mango");
        fruitCollection.add("watermelon");
        System.out.println(fruitCollection);

        //Remove the element
        fruitCollection.remove("Banana");
        System.out.println("==============");
        System.out.println(fruitCollection);

        //Check element is present or not
        System.out.println(fruitCollection.contains("mango"));
        System.out.println("==============");

        //For each
        for(String e: fruitCollection){
            System.out.println(e);
        }
        System.out.println("==============");
        System.out.println("=======Lambda=======");
        fruitCollection.forEach((element)->System.out.println(element));
        System.out.println("========Unique======");
        System.out.println(fruitCollection.stream().collect(Collectors.toSet()));
        System.out.println("========Clear======");
        fruitCollection.clear();
        System.out.println(fruitCollection);

    }
}
