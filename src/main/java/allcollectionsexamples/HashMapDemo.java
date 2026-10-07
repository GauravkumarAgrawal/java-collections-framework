package allcollectionsexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> numberMap = new HashMap<String,Integer>();
        numberMap.put("gaurav",2);
        numberMap.put("athrav",0);
        numberMap.put("Agrawal",3);
        numberMap.put("Shreyas",1);
        numberMap.put(null,9);

        //System.out.println(numberMap);
        System.out.println("Lambda printing");
        //numberMap.forEach((s, I) -> System.out.println(I) );

        System.out.println(numberMap.isEmpty());
        System.out.println(numberMap.size());
//        if(numberMap.containsKey("gaurav")){
//            System.out.println("exist");
//        }else{
//            System.out.println("Not exist");
//        }
//
//        if(numberMap.containsValue(1)){
//            System.out.println("vaalue exist");
//        }else{
//            System.out.println("Not exist");
//        }
        //Print map key and values
        for (Map.Entry<String,Integer> entry :numberMap.entrySet()){
            System.out.println("key => "  +entry.getKey() +" value -> " +entry.getValue());
        }

        System.out.println("====while loop iterator ========");
        Set<Map.Entry<String,Integer>>entries = numberMap.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println("Key===> "+entry.getKey() + " Values => "+entry.getValue());
        }

        System.out.println("Lambda printing");
        numberMap.forEach((K, V) ->{ System.out.println(K);
            System.out.println(V);});

    }
}
