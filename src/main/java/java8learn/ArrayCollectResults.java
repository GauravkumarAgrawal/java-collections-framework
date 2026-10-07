package java8learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCollectResults {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int []even = Arrays.stream(arr).filter(n->n%2==0).toArray();

        int []odd = Arrays.stream(arr).filter(n->n%2!=0).toArray();

        for (int i : even) {
            System.out.print(i);
        }
        System.out.println(Arrays.toString(odd));

        //int arr1[] = {15,12,53,74,85,06,70,86,94,1};
        List<Integer> a = Arrays.asList(15,12,53,74,85,06,70,86,94,1);

        for(int j :a){
            System.out.println(j);
        }
        System.out.println(a);

a.stream().forEach(System.out::println);

List<Integer> a2 = a.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(a2);


    }
}
