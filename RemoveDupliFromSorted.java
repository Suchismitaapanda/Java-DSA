//by using HashMap


import java.util.HashSet;
public class RemoveDupliFromSorted{
    public static void main(String args[]){
        int arr[]= {1,1,2,2,2,3,3};
        HashSet<Integer> set = new HashSet<>();
        // for(int num : arr){
        //     set.add(num);
        // }
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("Array without duplicates" + set);
    }
}


// by using 2 pointer


// import java.util.HashSet;
// public class RemoveDupliFromSorted{
//     public static void main(String args[]){
//         int arr[]= {1,1,2,2,2,3,3};
//         int k= removeDuplicates(arr);
//         System.out.println("Array after removing duplicates");
//         for(int i=0;i<k;i++){
//             System.out.println(arr[i]+ "");
//         }
//     }
//     static int removeDuplicates(int[] arr){
//         if(arr.length ==0){
//             return 0;
//         }
//         int i=0;
//         for(int j=1;j<arr.length;j++){
//             if(arr[i] != arr[j]){
//                 i++;
//                 arr[i]= arr[j];//new unique elemant into arr[i]
//             }
//         }
//         return i+1;
//     }
// }



