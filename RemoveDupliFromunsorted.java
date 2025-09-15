//HASHMAP TECHNIQUE

// import java.util.HashMap;

// public class RemoveDupliFromunsorted {
//     static void duplicate(int arr[], int n){
//         HashMap<Integer, Integer> mp= new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(!mp.containsKey(arr[i])){
//                 System.out.println(arr[i]+ " ");
//                 mp.put(arr[i],1);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int n=9;
//         int arr[]= {4,3,9,2,6,8,3,2,9};
//         duplicate(arr, n);
//     }
// }

//BOOLEAN ARRAY (TRUE MEANS UNIQUE)

import java.util.*;                       // (1) imports utility classes (HashSet, etc.). Not strictly needed in this program.

public class RemoveDupliFromunsorted {                   // (2) start of class

  static void duplicate(int arr[], int n) { // (3) method `duplicate` — takes an integer array and its length

    int mark[] = new int[n];              // (4) create an int array `mark` of same length; initial values = 0

    for (int i = 0; i < n; i++) {         // (5) loop to initialize all marks to 1
      mark[i] = 1;                        //     1 means "keep this element" initially
    }

    for (int i = 0; i < n; i++) {         // (6) outer loop: iterate through each element
      if (mark[i] == 1) {                 // (7) only process if this element is still marked to keep
        for (int j = i + 1; j < n; j++) { // (8) inner loop: compare arr[i] with every element after it
          if (arr[i] == arr[j]) {         // (9) if a later element equals the current one
            mark[j] = 0;                  //     mark that later element as 0 (duplicate)
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {         // (10) final loop: print elements that are still marked 1
      if (mark[i] == 1) {
        System.out.print(arr[i] + ",");
      }
    }
  }

  public static void main(String[] args) { // (11) main method — program entry point
    int n = 9;                             // (12) length of array
    int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 }; // (13) sample array with a duplicate '4'

    duplicate(arr, n);                     // (14) call duplicate() to remove duplicates (print unique elements)
  }
}
