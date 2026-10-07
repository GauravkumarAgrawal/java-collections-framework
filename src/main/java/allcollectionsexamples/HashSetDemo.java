package allcollectionsexamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("gaurav");
        set.add("agrawal");
        set.add("shreyas");
        set.add("athrav");
        System.out.println(set);
        System.out.println("========loop=======");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("========lambda=======");
        set.forEach(ele -> System.out.println(ele));
        System.out.println("========new set2=======");

        Set<String> set2 = new HashSet<>(set);
        System.out.println(set2);

        System.out.println("=================================");

        set2.remove("agrawal");
        System.out.println(set2);

    }
}
