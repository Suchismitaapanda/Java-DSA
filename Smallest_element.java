// import java.util.*;
// public class Smallest_element{
//     public static void main(String args[]){
//         int arr[]= {1,5,4,6,3,2};
//         System.out.println("Smallest element: "+ sort(arr));
//     }
//     static int sort(int arr[]){
//         Arrays.sort(arr);
//         return arr[0];
//     }
// }


import java.util.*;
public class Smallest_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr = new int[n];// create array of size n
        System.out.print("Enter" + n + "elements");
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();//user enters each elements one by one 
        }
        int Smallest = arr[0];// initialized smallest
        for(int i=1; i<n; i++){
            if(arr[i] < Smallest){
                Smallest = arr[i];
            }
        }
        System.out.println("Smallest element :" + Smallest);
        sc.close();
    }
}

