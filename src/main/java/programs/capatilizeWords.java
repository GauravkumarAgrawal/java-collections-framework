package programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class capatilizeWords {
    public static void main(String[] args) {
        String input = "gaurav kumar agrawal";
        String result = Arrays.stream(input.split("\\s+")) // Split into stream of words
                .filter(word -> !word.isEmpty())           // Remove any empty strings
                .map(word -> Character.toUpperCase(word.charAt(0))
                        + word.substring(1).toLowerCase()) // Capitalize each
                .collect(Collectors.joining());            // Join without spaces
        System.out.println("Original: "+input);
        System.out.println("Formatted: " + result);


        String input1 = "athrav gaurav agrawal";
        String result1 = convertToCamelCase(input1);

        System.out.println("Original: " + input1);
        System.out.println("Formatted: " + result1);

    }

    public static String convertToCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        // Split the string by one or more spaces
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and add the rest of the word in lowercase
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
            }
        }

        return sb.toString();
    }

}
