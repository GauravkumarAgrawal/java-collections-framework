package programs;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class DuplicateElements {
    public static void main(String[] args) {
        String infra[] = {"Amazon","Google", "Alibaba","Azure","Amazon","Google"};

        System.out.println("=================================");
        System.out.println("###Brute Force ####");
        for(int i= 0 ; i<infra.length;i++){
            for(int j = i+1;j<infra.length;j++){
                if(infra[i].equalsIgnoreCase(infra[j])){
                    System.out.println(infra[i]);
                }
            }
        }

        System.out.println("=================================");
        System.out.println("### Hash Set No duplicate ####");
        int v= 0;
        Set<String> data = new HashSet<String>();
        for(String e :infra){
            if(data.add(e)==false){
                v++;
                System.out.println(e);

            }
            //System.out.println(v);
        }
        System.out.println("=================================");

        System.out.println(" #### Hashmap ##### ");
        Map<String, Integer> infraMap = new HashMap<String, Integer>();
        for(String e : infra){
            Integer count = infraMap.get(e);
            if(count == null){
                infraMap.put(e,1);
            }else {
                infraMap.put(e,count+1);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = infraMap.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey());
                }
        }
        System.out.println("=================================");
        System.out.println(" #### STREAMS  ##### ");

        Set<String> dataSet = new HashSet<>();
        //unique data
        Set<String> uniqueSet = Arrays.asList(infra).stream().filter(e ->dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(uniqueSet);
        System.out.println("======not duplicate=======");
        Set<String> dupSet = Arrays.asList(infra).stream().filter(e-> !dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(dupSet);

        System.out.println("=================================");
        System.out.println(" #### one more  ##### ");

        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        for(String word : infra){
            if(wordCount.containsKey(word.toLowerCase())){
                //If present increment the count to 1
                wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
            }else{
                //if not present put that word into word count with 1 as it's value
                wordCount.put(word.toLowerCase(),1);
            }
        }
        //Extract all values
        Set<String> wordsInString = wordCount.keySet();
        for(String word : wordsInString){
            System.out.println(word +"==> "+wordCount.get(word));
            if(wordCount.get(word)>1){
                System.out.println(word +": "+wordCount.get(word));
            }
        }


    }


}
