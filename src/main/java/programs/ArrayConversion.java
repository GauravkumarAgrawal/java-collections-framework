package programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {
    public static void main(String[] args) {
        String arr[] = {"t","r","v"}; //t;r;y try t|r|y
        System.out.println("      === ");
        System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            System.out.print(";" + s);
        }
        System.out.println(" === ");

        String join = String.join(":",arr);
        System.out.println(join);
        //Join in String
        String str = Arrays.asList("t","r","y","i","n","g").stream().collect(Collectors.joining(""));
        System.out.println(str);
        //Join in Integers
        String str1 = Arrays.asList(1,2,3,4,5,6,7).stream().map(e->String.valueOf(e)).collect(Collectors.joining(""));
        System.out.println(str1);
        //Call method for Int and Strings
        System.out.println(joinString("*","g","a","u","r","a","v"));
        System.out.println(joinIntegers("#",1,2,3,4,5,6,7));
    }

    public static String joinString(String seperator, String... values){
        StringBuilder sb = new StringBuilder();
        int end = 0;
        for(String s: values){
            if (s != null) {

                sb.append(s);
                end= sb.length();
                sb.append(seperator);
            }

        }
        return sb.substring(0,end);
    }

    public static String joinIntegers(String seperator, Integer... num){
        StringBuilder sb = new StringBuilder();
        int end = 0;
        for(Integer s: num){
            if (s != null) {

                sb.append(s);
                end= sb.length();
                sb.append(seperator);
            }

        }
        return sb.substring(0,end);
    }
}
