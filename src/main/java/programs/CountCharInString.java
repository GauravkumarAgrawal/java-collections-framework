package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountCharInString {
    public static void main(String[] args) {
        String str= "my name is gaurav    and i like apple";
        char c = 'a';
        int count=0;
        System.out.println("=================================================");

        count = str.length() - str.replaceAll("a","").length();
        System.out.println(count);

        System.out.println("=======================print even number======================");

        int num[]= {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(Integer i:num){
            if(i%2==0){
                al.add(i);
            }
        }
        System.out.println(al);

        System.out.println("=======================print even number Stream ======================");


        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> result = list.stream().filter(i -> i %2==0).collect(Collectors.toList());

        System.out.println(result);

        System.out.println("=======================print array to string ======================");

        // create an integer array
        int[] n = {1, 2, 3, 4};

        // print the array using
         Arrays.toString(n);
        System.out.println(Arrays.toString(n));

    }
}
