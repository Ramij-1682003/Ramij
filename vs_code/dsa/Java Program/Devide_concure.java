public class Devide_concure {

    //mergeshort
    public static void merge_short(int arr[],int start,int end) {
        
        int mid = start + (end - start) / 2;
        if(start>=end){
            return;
        }
        
        merge_short(arr, start, mid);
        merge_short(arr, mid + 1, end);
        merge(arr, start, end, mid);
    }
    
    public static void merge(int arr[],int start,int end,int mid){
        
        int temp[]=new int[end - start + 1];
        int i=start;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=end){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
          }
        else{
            temp[k++]=arr[j++];
            }
    }
    while (i<=mid){
        temp[k++]=arr[i++];
    } 
    while(j<=end){
        temp[k++]=arr[j++];
    }
    for(int l=0,s=start;l<temp.length;l++,s++){
        arr[s]=temp[l];
    }
}

public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//Quick short
public static void quick_short(int arr[],int pivot){
     
    
}
    
    public static void main(String[] args) {
       int arr[]={6,3,9,8,2,5};
    //    int start=0;
    //    int end=arr.length-1;
    //    merge_short(arr, start, end);
    //      print(arr);
    int pivot=5; 
    quick_short(arr, pivot);
        
       
    }
}