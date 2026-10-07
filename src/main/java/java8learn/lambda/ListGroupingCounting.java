package java8learn.lambda;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class ListGroupingCounting {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String,Long> countByOddEven = num.stream().collect(Collectors.
                groupingBy(n-> n%2==0?"Even":"Odd",
                        Collectors.counting()));
        System.out.println(countByOddEven);

        //ParallelStreamOddEven
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Even numbers (parallel):");
        numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .forEachOrdered(System.out::println);

        System.out.println("\nOdd numbers (parallel):");
        numbers.parallelStream()
                .filter(n -> n % 2 != 0)
                .forEachOrdered(System.out::println);

        //IntPredicate
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntPredicate isEven = n -> n % 2 == 0;
        IntPredicate isOdd = n -> n % 2 != 0;

        System.out.println("Even numbers:");
        numbers.stream()
                .mapToInt(Integer::intValue)
                .filter(isEven)
                .forEach(System.out::println);

        System.out.println("\nOdd numbers:");
        numbers.stream()
                .mapToInt(Integer::intValue)
                .filter(isOdd)
                .forEach(System.out::println);
    }
}
