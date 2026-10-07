package java8learn;

import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args) {
        int []num = {1,2,3,4,5,4,4,4,10};
//        System.out.println("Even numbers ");
//        Arrays.stream(num).filter(n->n%2==0).forEach(System.out::println);
//        System.out.println("Odd number");
//        Arrays.stream(num).filter(n->n%2!=0).forEach(System.out::println);
        Arrays.stream(num).filter(n -> 4 != n).forEach(System.out::print);
        System.out.println("");
        System.out.println(Arrays.stream(num).filter(n -> 4 != n).count());
    }
}
