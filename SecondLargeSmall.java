// import java.util.Arrays;
// class Solution {
//     public int print2largest(int[] arr) {
//         int n = arr.length;

//         // Sort the array in ascending order
//         Arrays.sort(arr);

//         int largest = arr[n - 1];

//         // Traverse from second last to find second largest
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] != largest) {
//                 return arr[i]; // Found second largest
//             }
//         }

//         // If all elements are same or no second largest
//         return -1;
//     }
// }


// class Solution {
//     public int getSecondLargest(int[] arr) {
//         int largest=arr[0];
//         int sLargest=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 sLargest=largest;
//                 largest=arr[i];
//             }
//             else if(arr[i]<largest && arr[i]>sLargest){
//                 sLargest=arr[i];
//             }
//         }
//         return sLargest;
//     }
// }

import java.util.*;

public class SecondLargeSmall {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        Arrays.sort(arr);  // Sort array

        int secondSmallest = arr[1];              // 2nd element
        int secondLargest = arr[arr.length - 2];  // 2nd last element

        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
