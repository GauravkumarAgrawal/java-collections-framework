package programs;

import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = " Learn Java Programing";
        str= str.toLowerCase();
        System.out.println(str);

        char []strArray = str.toCharArray();

        HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();

        for(char c: strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }

        Set<Character> charString = charCountMap.keySet();
        for(char c : charString){
            if(charCountMap.get(c)>1){
                System.out.println(c+" : "+charCountMap.get(c));
            }
        }
    }
}
