public class Selection_sort {
    public static void main(String args[]){
        // int arr[]={4,5,1,3,4,8,2};
        int arr[]={-4,5,0,3,-41,8,0};
        selection_sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int lastindex = arr.length - i - 1;
            int maxindex = 0;
            for(int j = 1; j <= lastindex; j++){
                if(arr[j] > arr[maxindex]){
                    maxindex = j;
                }
            }
            // swap
            int temp=arr[lastindex];
            arr[lastindex]=arr[maxindex];
            arr[maxindex]=temp;
        }
    }
}
