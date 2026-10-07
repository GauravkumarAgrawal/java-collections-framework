package programs;

public class MaxfromArray {
    public static void main(String[] args) {
        int arr[] = {1,5,7,34,9,0};
        int max =maxArray(arr);
        System.out.println(max);

    }

    public static int maxArray(int[] arr){
        int max = arr[0];
        for(int value: arr){
            if(value>max){
                max= value;
            }
        }
        return max;
    }
}
