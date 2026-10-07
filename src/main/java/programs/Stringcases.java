package programs;

import java.util.HashMap;

public class Stringcases {
    public static void main(String[] args) {
        String st = "This is my fIrst program ";
        String text = " I was born on thirty January ";
        //Replace all spaces
        int count = st.replaceAll("\\s+","").length();
        System.out.println(count);

        //Replace All vowels
        String removeVowel = st.toLowerCase().replaceAll("[aeiou]","");
        System.out.println(removeVowel);

        int vowel = 0;
        for(char c : st.toLowerCase().toCharArray()){
            if(c=='a'||c=='e'|| c=='i'||c=='o'||c=='u'){
                vowel++;
            }
        }
        System.out.println(vowel);

        //Count digits in string
        int num =0;
        for(char a : text.toCharArray()){
            if(Character.isAlphabetic(a)){
                num++;
            }
        }
        System.out.println(num);

        //isPalindrome
        String checkPalindrome = "level";
        boolean flag = true;
        for(int i = 0; i<checkPalindrome.length()/2;i++){
            if(checkPalindrome.charAt(i) != checkPalindrome.charAt(checkPalindrome.length() -1 -i)){
                flag= false;
                break;
            }
        }
        if(flag){
            System.out.println(checkPalindrome + " is palindrome ");
        }else{
            System.out.println(checkPalindrome + " is not  palindrome ");
        }

        String text1 = "bannnnnana";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : text1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println(freq);
    }
}
