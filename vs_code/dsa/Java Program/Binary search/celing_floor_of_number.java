public class celing_floor_of_number { 
    public static int find_Ceiling_floor(int arr[], int target){
        
        if(target>arr[arr.length-1] || target<arr[0]){
            return-1;
        }
        
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return target;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1; 
            }
        }
        
        // return arr[start];  // for celing of a number
        return arr[end]; // for floor of a number
        // return -1; // for binary search 
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,19};
        System.out.println(find_Ceiling_floor(arr,18));
    }
}
