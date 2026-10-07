package java8learn.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@FunctionalInterface
interface Calculator{
    int operate(int a, int b);
}



public class LambdaDemoOne {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram","shayam","seeta","geeta","John","jane","john");
        names.forEach(name -> System.out.println(name));
        //comapre the names sort in ascending order
        Collections.sort(names,(a,b)->a.compareTo(b));
        System.out.println(names);

        //calculate the maths
        Calculator add = (a,b)->a+b;
        Calculator multiple = (a,b) ->a*b;

        System.out.println(add.operate(5,5));
        System.out.println(multiple.operate(5,5));

        //Upper case all list
        List<String>uppercase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercase);
        //Filter name starting with and J and collect them in new List
        List<String> list = names.stream().filter(name ->name.toLowerCase().startsWith("j")).collect(Collectors.toList());
        System.out.println(list);

        //Sum of numbers
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        int sum = num.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        //parallel streams
        IntStream.range(1,20).parallel().forEach(System.out::println);

        List<String> str = Arrays.asList("banana","mango","pine","banana","watermelon","apple","sapota","pine");
        Map<String, Long> itemCount = str.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(itemCount);

        Map<String, Integer> itemCount1 = str.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        System.out.println(itemCount1);

    }
}
