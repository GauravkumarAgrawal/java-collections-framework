package allcollectionsexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");
        //1. Iterate through a HashMap EntrySet using Iterator
        Iterator<Map.Entry<Integer, String>> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()) {
           Map.Entry<Integer,String> entry = iterator.next();
           // System.out.println("key=> "+ entry.getKey()+ " & "+" Value=> "+entry.getValue());
        }

        //2. Iterate through HashMap KeySet using Iterator
        Iterator<Integer> iterator1 = coursesMap.keySet().iterator();;
        while (iterator1.hasNext()){
            Integer key = iterator1.next();
            //System.out.println("key=> "+ key + " & "+" Value=> "+ coursesMap.get(key));

        }
        // 3. Iterate HashMap using For-each Loop
        for(Map.Entry<Integer, String> entry1: coursesMap.entrySet()){
           // System.out.println("key=> "+ entry1.getKey() + " & "+" Value=> "+ entry1.getValue());
        }

// 4. Iterating through a HashMap using Lambda Expressions
        coursesMap.forEach((key,value) ->
        {           // System.out.println("key=> "+ key + " & "+" Value=> "+ value);
        });
// 5. Loop through a HashMap using Stream API
        coursesMap.entrySet().stream().forEach((entry)->
        {
            System.out.println("key=> "+ entry.getKey() + " & "+" Value=> "+ entry.getValue());
        });

    }
}