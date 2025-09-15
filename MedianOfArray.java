import java.util.*;
public class MedianOfArray {
    public static double findMedian(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==1){
            return arr[n/2];
        }
        else{
            return (arr[(n-1)/2]+ arr[n/2]) /2;
        }
    }
    public static void main(String args[]){
        int arr[]= {1,9,5,3,8,2};
        System.out.println("Median is" + findMedian(arr));
    }
}



