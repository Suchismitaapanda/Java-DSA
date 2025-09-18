// public class NonRepeatingElem {
//     public static void main(String[] args) {
//         int arr[]= {4,3,9,2,4,1,10,3,9,89};
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             boolean isUnique=true;
//             for(int j=0;j<n;j++){
//                 if(i!=j && arr[i]==arr[j]){
//                     isUnique=false;
//                     break;
//                 }
//             }
//             if(isUnique){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }




// import java.util.*;
// public class NonRepeatingElem
// {
// 	static void findNonRepeatingElement(int nums[]) {
// 	    Arrays.sort(nums);

// 		// for (int i = 0; i < n; i++) {  // here we use OR OPERATOR  (is one is correct no need to check the other)
//         //     // check left neighbor and right neighbor
//         //     if ((i == 0 || arr[i] != arr[i - 1]) && 
//         //         (i == n - 1 || arr[i] != arr[i + 1])) {
//         //         System.out.println(arr[i]);
	    
// 	    if(nums[0] != nums[1]) System.out.print(nums[0]+" ");
	    
// 	    for(int i=1;i<nums.length-1;i++) 
// 	        if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
// 	            System.out.print(nums[i]+" ");
	            
// if(nums[nums.length-2] != nums[nums.length-1]) System.out.print(nums[nums.length-1]);
// 	}
// 	public static void main(String[] args) {
// 		int nums[] = {1,2,-1,1,3,1,4};
// 		System.out.println("Non-repeating numbers are: ");
// 		findNonRepeatingElement(nums);
		
// 	}
// }


/-----------x-------------


import java.util.*;
import java.util.Map.Entry;
public class NonRepeatingElem
{
	static void findNonRepeatingElement(int nums[]) {
	    HashMap<Integer,Integer> hashMap = new HashMap<>();
	    
	    for(int i:nums) {
	        if(hashMap.get(i) == null) hashMap.put(i,1);
	        else hashMap.put(i,hashMap.get(i)+1);
	    }
	    
	    for(Entry<Integer,Integer> entry:hashMap.entrySet()) {
	        if(entry.getValue()==1)
	            System.out.print(entry.getKey()+" ");
	    }
	}
	public static void main(String[] args) {
		int nums[] = {1,2,-1,1,3,1};
		System.out.println("Non-repeating numbers are: ");
		findNonRepeatingElement(nums);
	}
}