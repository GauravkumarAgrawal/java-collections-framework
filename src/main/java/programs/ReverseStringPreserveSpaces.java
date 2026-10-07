package programs;

public class ReverseStringPreserveSpaces {
    public static void main(String[] args) {
        String input = "java is good programming language";

        // Convert input to char array
        char[] inputArray = input.toCharArray();
        char[] result = new char[inputArray.length];

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Fill characters in reverse order, skipping spaces
        int j = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                while (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + String.valueOf(result));
    }
}
