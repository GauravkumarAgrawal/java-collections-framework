package programs;

public class ReserveString
{
    public static void main(String[] args) {
        String str = "gaurav";
        String str1 = "gaurav Agrawal ";

        System.out.println("===========recursion=========");
        System.out.println(reverseWithRecursion(str1));

        System.out.println("===========01========");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb);
        String temp ="";
        System.out.println("=========02==========");
        for(int i = str.length()-1; i>=0;i--){
            temp =temp + str.charAt(i);
        }
        System.out.println(temp);

    }

    public static String reverseWithRecursion(String str1) {
        if (str1.isEmpty()) {
            return str1;
        }
        return reverseWithRecursion(str1.substring(1)) + str1.charAt(0);
    }

}
