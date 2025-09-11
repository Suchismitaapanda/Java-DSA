// import java.util.*;
// public class Reverse{
//     public static void main(String[] args){
//         int[] arr = {10, 20, 30, 40, 50};
//         System.out.println("Original arr" + Arrays.toString(arr));
//         // Reverse logic
//         int n = arr.length;
//         for(int i=0;i< n/2;i++){
//             int temp= arr[i];
//             arr[i]=arr[n-1-i];
//             arr[n-1-i]= temp;
//         }
//         System.out.println("Reversed Array: " + Arrays.toString(arr));
//     }
// }



import java.util.*;
public class Reverse{
    public static void main(String[] args){
        int arr[]= {2,5,4,9,8};
        int n = arr.length;
        int[] rev = new int[n];  // new array for reversed

        // Store elements in reverse order
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}