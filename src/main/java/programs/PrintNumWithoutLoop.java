package programs;

import java.util.stream.IntStream;

public class PrintNumWithoutLoop {
    public static void main(String[] args) {
        //Use recursion
        //printNum(1,100);
        //Streams 1 line code
        IntStream.range(3,30).forEach(e -> System.out.println(e));
    }

    public static void printNum(int first, int last){
        if(first<=last){
            System.out.print(first);
            first++;
            printNum(first,last);
        }
    }
}
