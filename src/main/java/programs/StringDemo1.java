package programs;

import java.util.Arrays;

import static java.lang.String.format;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = " I am the best in the testing world";
        String s1 = "who is the best tester in the world";
//        System.out.println(s);
//        System.out.println(s.charAt(6));
//        System.out.println(s.codePointAt(6));
//        System.out.println(s.compareTo(s1));
//        System.out.println(s1.concat(s));
//        System.out.println(s.contains("a"));
//        System.out.println(s.contentEquals("testing"));

        String myStr = "Hello %s! One kilobyte is %,d bytes.";
        String result = String.format(myStr, "World", 1024);
        //System.out.println(result);


        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        //System.out.println(myArray);

        String myStr1 = "Hello, World!";
        myStr1.getChars(7, 12, myArray, 4);
       // System.out.println(myArray);

//        System.out.println(s.length());
//        System.out.println(s.lastIndexOf('d'));

//        System.out.println(s.replaceFirst("a","&"));
//        System.out.println(s.replaceAll(" ","%"));

       String ss[]= s1.split("\\s+");
        for (String string : ss) {
            System.out.println(string);
        }
        //Arrays.stream(s.split(" ")).forEach(System.out::println);
        System.out.println(s.startsWith(""));

      char c[]=   s.toCharArray();
        for (char c1 : c) {
            System.out.println(c1);

        }

    }


}
