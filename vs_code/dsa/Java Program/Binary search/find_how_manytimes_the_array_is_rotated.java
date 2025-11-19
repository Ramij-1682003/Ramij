public class find_how_manytimes_the_array_is_rotated {
    
    public static int count(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        return mid+1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println("The array is rotated "+count(arr)+" times");
    }
}
