public class find_element_in_infinite_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40}; // infinite array
        int target=30;
        
        // search(arr, 30, size_of_box(arr, 30)[0], size_of_box(arr, 0)[1]);
        System.out.println(size_of_box(arr, target));
        
    }
    
    // used to find the start and end 
    public static int size_of_box(int arr[],int target){                      
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target, start, end);  // callindg the binary search for the start and end
    }
    //binary search
    public static int binarysearch(int arr[],int target,int start,int end){               
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
