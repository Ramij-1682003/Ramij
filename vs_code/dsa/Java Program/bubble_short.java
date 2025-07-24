public class bubble_short {
    public static void swap(int arr[], int i,int j){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    
    }
    
    public static void bubble_short(int arr[]){
        
        for(int turns=0;turns<arr.length-1;turns++){
            for(int i=0;i<arr.length-1-turns;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
   public static void main(String args[]){
    int arr[]={5,4,1,3,2};
    bubble_short(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

   }
}
