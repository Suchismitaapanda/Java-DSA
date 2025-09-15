public class AverageArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5}; // input array
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum=sum + arr[i];
        }
        int avg = sum/n;
        System.out.println(avg);
    }
}