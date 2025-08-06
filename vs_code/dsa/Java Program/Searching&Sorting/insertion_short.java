public class insertion_short {
    public static void insertion_short(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            
            int current=arr[i];
            // int previous=i-1;
            
            while(i-1>=0 && arr[i-1]>current){
                arr[i]=arr[i-1];
                i--;
            }
            
            arr[i]=current;
        }
    }
    public static void main(String args[]){
        int arr[]={5,2,4,6,1,3};
        
        insertion_short(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
