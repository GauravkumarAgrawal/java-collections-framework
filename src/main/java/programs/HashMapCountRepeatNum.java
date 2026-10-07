package programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapCountRepeatNum {
    public static void main(String[] args) {
        //String s = "111289787";
        String s = "abbsbsvavavavaz";

        HashMap<Character,Integer> valueToTimesMap = new HashMap<Character,Integer>();
        for(char c : s.toCharArray()){
            if(valueToTimesMap.containsKey(c)){
                int times = valueToTimesMap.get(c);
                valueToTimesMap.put(c,times+1);

            }else {
                valueToTimesMap.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : valueToTimesMap.entrySet()){
            //System.out.println(entry.getKey() +": "+entry.getValue());
            if(entry.getKey()>=1){
                System.out.println(entry.getKey() +" ==> "+entry.getValue());
            }
        }
    }
}
