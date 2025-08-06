public class selection_short{
public static void selectionshort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            // swap
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
            }
        }

    
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selectionshort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

