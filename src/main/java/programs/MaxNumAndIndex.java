package programs;

import java.util.*;

public class MaxNumAndIndex {
    public static void main(String[] args) {
        int arr[] ={2,5,7,11,76,1,98,4,999};
        int max = arr[0];
        int maxIndex=0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                maxIndex=i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);

        int arr1[] = {1,4,7,9,10,89};
        Set<Integer> list = new HashSet<Integer>();
        int max1 = arr1[0];
        int min1 = arr1[0];
        for(int i = 0; i<arr1.length;i++){
            list.add(arr1[i]);
            if(arr1[i]>=max1){
                max1=arr1[i];
            }if(arr1[i]<=min1){
                min1=arr1[i];
            }
        }

        System.out.println(min1);
        System.out.println(max1);

        for(int i = min1; i<=max1;i++){
            if(!list.contains(i)){
                System.out.print(i);
            }
        }
        System.out.println("=====--------------------------=====");



        int a[] ={1,4,7,9,10,89};
        Set<Integer> list1= new  HashSet<Integer>();
        for(int i = 0;i<a.length;i++){
            list1.add(a[i]);
        }
        System.out.println(list1);
        System.out.println("==========");
        for(int i = 1;i<=89;i++){
            if(!list1.contains(i)){
                System.out.print(i);
            }
        }
        System.out.println("==========");
        int aarr[] ={2,985,7,900,76,1,981,4,999};
        int maxx = arr[0];

        for(int i = 0; i<aarr.length;i++){
            if(aarr[i]>=maxx){
                maxx=aarr[i];
            }
        }
        System.out.println(maxx);
        int secMax=Integer.MIN_VALUE;
        for(int i= 0; i<aarr.length;i++){
            if(aarr[i] !=maxx && aarr[i]>secMax){
                secMax = aarr[i];
            }
        }
        System.out.println(secMax);

    }
}
