package java8learn;

import java.util.Arrays;

public class ArrayOddEvenMethods {
    public static void main(String[] args) {
        int []num = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Even number" );
        printEvenNumber(num);
        System.out.println("Odd number" );
        printOddNumber(num);
    }

    private static void printOddNumber(int[] num) {
        Arrays.stream(num).filter(ArrayOddEvenMethods::isEven).forEach(System.out::println);
    }

    private static boolean isEven(int i) {
        return i%2==0;
    }

    private static void printEvenNumber(int[] num) {
        Arrays.stream(num).filter(ArrayOddEvenMethods::isOdd).forEach(System.out::println);
    }

    private static boolean isOdd(int i) {
        return i%2!=0;
    }
}
