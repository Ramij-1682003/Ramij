public class largest_in_array {
    public static int max(int arr[]){
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
    //            
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,2,6,3,5,7};
        max(arr);
        System.out.println("Max= "+max(arr));

            // int[] numbers = {5, 34, 78, 2, 45, 1, 99, 23};
            // int max = numbers[0]; // Start with the first element
    
            // for (int i = 1; i < numbers.length; i++) {
            //     if (numbers[i] > max) {
            //         max = numbers[i];
            //     }
            // }
    
            // System.out.println("Largest element is: " + max);
        }
    }

    

