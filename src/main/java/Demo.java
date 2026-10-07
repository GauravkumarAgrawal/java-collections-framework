import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Example with int array
        int[] arr = {1, 2, 3};

        System.out.println("Printing array elements one by one:");
        for (int j : arr) {
            System.out.println(j);
        }

        System.out.println("Printing the array directly:");
        System.out.println(arr); // prints memory reference
        System.out.println("Using Arrays.toString(arr):");
        System.out.println(Arrays.toString(arr)); // prints [1, 2, 3]

        // Example with List
        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println("\nPrinting list elements one by one:");
        for (int j : list) {
            System.out.println(j);
        }

        System.out.println("Printing the list directly:");
        System.out.println(list); // prints [1, 2, 3]
    }
}

