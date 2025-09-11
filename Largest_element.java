
import java.util.*;
public class Largest_element {
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: " + sort(arr1));
   
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: " + sort(arr2));
  }
  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}




// import java.util.Scanner;

// public class Largest_element {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter number of array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter " + n + " numbers");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int Largest = arr[0];
//         for( int i =1;i<n;i++){
//             if(arr[i]>Largest){
//                 Largest = arr[i];
//             }
//         }
//         System.out.println("Largest element :" + Largest);
//         sc.close();
//     }
// }



// geeks for geeks

// class Largest_element {
//     public static int largest(int[] arr) {
//         // code here
//         int largest=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 largest=arr[i];
//             }
//         }
//         return largest;
//     }
// }

