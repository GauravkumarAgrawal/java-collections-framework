package programs;

public class StringToArrayExample {
    public static void main(String[] args) {
        String str = " This is Gaurav ";
        System.out.println(str);
        //convert String to Char Array

        char charArray[] = str.toCharArray();
        //print
        for (char c: charArray){
            System.out.println(c);
        }

        System.out.println("===========================");
        String splitStr = "Hello,World,How,Are,You?";
        System.out.println(splitStr);
        String newSplitStr[] = splitStr.split(",");

        for (String s : newSplitStr){
            System.out.println(s);
        }

        System.out.println("===========");

    }
}
