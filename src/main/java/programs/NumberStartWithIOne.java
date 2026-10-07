package programs;

import java.util.ArrayList;
import java.util.List;

public class NumberStartWithIOne {
    public static void main(String[] args) {
        int arr[] = {1,42,1223,124,9,34};
        System.out.println(getNumberList(arr));
    }

    public static Integer getFirstNumber(int num){
        while(num>=10){
            num = num/10;
        }
        return num;
    }

    public static List<Integer> getNumberList(int[] arr){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int num :arr){
            int n = getFirstNumber(num);
            if(n==1){
                numbers.add(num);
            }
        }
        return numbers;
    }

}
