package programs;

import java.util.HashMap;

public class EachCharCount {
    public static void main(String[] args) {
        String s = " all are my brothers and sisters ";
        String noSpace = s.replaceAll("\\s+","");
        System.out.println(noSpace);
        char []strArray = noSpace.toCharArray();

        HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
        for(char c : strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }

        }
        System.out.println(charCountMap);
    }
}
