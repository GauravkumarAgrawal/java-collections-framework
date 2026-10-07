package programs;

import java.util.Arrays;

public class OneToHundredWithOutNumber {
    public static void main(String[] args) {
        int first = 'A'/'A'; // =1 'd' = 100 in ascii
        //solution 2
        String str = "..........";
        for(int i = first; i<='d';i++){
           // System.out.print(i);
        }
        //solution 1
        for(int i=first; i<=(str.length() *str.length());i++){
            //System.out.println(i);
        }

        //Solution 3
        Object num[] = new Object[10];
        Arrays.fill(num,new Object(){
            int count = 0;
            public String toString(){
                return Integer.toString(++count);
            }

        });
        System.out.println(Arrays.toString(num));

    }
}
