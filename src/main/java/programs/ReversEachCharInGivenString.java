package programs;

//public class ReverseeachCharInGivenString {
//    public static void main(String[] args) {
//        String s = "java is good programming language";
//        String words[] = s.split(" ");
//        String reverseString = "";
//        for(int i = 0 ;i<words.length;i++){
//            String word = words[i];
//            String reversWord = "";
//            for(int j = word.length()-1;j>=0; j--){
//                reversWord = reversWord + word.charAt(j);
//                System.out.println(reversWord);
//            }
//            reverseString = reverseString +reversWord+"";
//           // System.out.println(reverseString);
//        }
//        System.out.println("Old string=> "+s);
//        System.out.println("New String=> "+reverseString);
//    }
//}

public class ReversEachCharInGivenString {
    public static void main(String[] args) {
        String s = "java is good programming language";
        String[] words = s.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseString.append(reverseWord.reverse()).append(" ");
        }

        System.out.println("Old string => " + s);
        System.out.println("New string => " + reverseString.toString().trim());

        System.out.println("=========================================");
        String input = "java is good programming language";

        // Split by spaces but keep track of them
        String[] wordss = input.split(" ", -1); // -1 keeps trailing spaces if any
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < wordss.length; i++) {
            String word = wordss[i];
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord);

            // Add space back except after the last word
            if (i < wordss.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("Word-by-word reversed: " + result.toString());

   }
}
