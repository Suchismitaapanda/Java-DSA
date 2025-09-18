// public class RepeatingElem {
//     public static void main(String[] args) {
//         int[] arr = {4, 3, 9, 2, 4,1, 1, 10, 3, 89, 34};

//         System.out.println("Repeating elements:");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     System.out.println(arr[i]);
//                     break; // avoid printing same element multiple times
//                 }
//             }
//         }
//     }
// }


//SHORTING TECHNIQUE


// import java.util.Arrays;

// public class RepeatingElem
// {
// 	static void findRepeatingElements(int arr[]) {
// 	    Arrays.sort(arr);
	    
// 	    System.out.print("The repeating elements are: ");
// 	    for(int i=0;i<arr.length-1;i++) 
// 	        if(arr[i] == arr[i+1])
// 	            System.out.print(arr[i]+" ");
// 	}
// 	public static void main(String[] args) {
// 		int[] arr = {1,1,2,3,4,4,5,2};
// 		findRepeatingElements(arr);
// 	}
// }


//HASHMAP TECHNIQUE 



/------x---------


import java.util.HashMap;

public class RepeatingElem {
    public static void main(String[] args) {
        int[] arr = {4, 3, 9, 2, 4, 1, 10, 3, 9, 89, 34};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency using normal for loop
        for (int i = 0; i < n; i++) {
            int num = arr[i];  // take element
            if (map.containsKey(num)) {   //Checks: “Does this number already exist in the map?”
                map.put(num, map.get(num) + 1);  // already exists → increase count
            } else {
                map.put(num, 1);  // first time → count = 1
            }
        }
        // Print repeating numbers
        System.out.println("Repeating elements:");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}
