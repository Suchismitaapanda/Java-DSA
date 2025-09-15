// INSERTING ELEMENT AT BEGINING

// public class AddingArrayPosition {
//     static void insertatbegin(int arr[],int n,int value){
//         for(int i=n-1;i>=0;i--){
//             arr[i+1]=arr[i];
//         }
//         arr[0]=value;
//     }
//     public static void main(String[] args) {
//         int arr[]={10,9,14,8,20,48,16,9,0};
//         int n=8;
//         int value = 40;
//         System.out.println("Before inserting");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         insertatbegin(arr,n,value);
//         System.out.println("After inserting");
//         for(int i=0;i<=n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// INSERTING ELEMENT AT END


// public class AddingArrayPosition {
//     static void insertatEnd(int arr[],int n,int value){
//         arr[n]=value;
//     }
//     public static void main(String[] args) {
//         int arr[]={10,9,14,8,20,48,16,9,0};
//         int n=8;
//         int value = 40;
//         System.out.println("Before inserting");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         insertatEnd(arr,n,value);
//         System.out.println("After inserting");
//         for(int i=0;i<=n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



// INSERTING ELEMENT AT A SPECIFIC POSITION


public class AddingArrayPosition {
    static void insertatposition(int arr[],int n,int value,int pos){
        for(int i=n;i>= pos;i--){
            arr[i]= arr[i-1];
        }
        arr[pos -1]= value;
    }
    public static void main(String[] args) {
        int arr[]={10,9,14,8,20,48,16,9,0};
        int n=8;
        int pos=5;
        int value = 40;
        System.out.println("Before inserting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        insertatposition(arr,n,value,pos);
        System.out.println("After inserting");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
