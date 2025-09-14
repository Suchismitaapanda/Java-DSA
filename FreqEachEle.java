// public class FreqEachEle {
//     public static void main(String args[]){
//         int arr[]= {1,3,5,2,1,6,3,6,2,4,1};
//         int n= arr.length;
//         countFreq(arr, n);
//     }
//     public static void countFreq(int arr[], int n) {
//         boolean visited[]= new boolean[n];
//         for(int i=0;i<n;i++){
//             if(visited[i] == true){
//                 continue;
//             }
//             int count= 1;
//             for(int j=i+1;j<n;j++){
//                 if(arr[i] == arr[j]){
//                     visited[j] = true;
//                     count++;
//                 }
//             }
//             System.out.println(arr[i]+" "+ count);
//         }
//     }
// }

//--------------------X-------------------

import java.util.HashMap;
public class FreqEachEle {
    public static void main(String[] args){
        int[] arr = {10,5,10,15,10,5}; // input array
        int n = arr.length;
        Frequency(arr, n);//call the function
    }
    static void Frequency(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){ //if element already present
                map.put(arr[i], map.get(arr[i])+1); // increase count
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){  //print freq of each element
        System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}


