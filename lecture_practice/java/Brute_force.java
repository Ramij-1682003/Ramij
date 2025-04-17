public class Brute_force {
        public static void sub_arr(int arr[]){
            int max_sum=Integer.MIN_VALUE;
        
            for(int i=0;i<arr.length;i++){
                
                for(int j=i+1;j<arr.length;j++){
                    int sum=0;
                    
                    for(int k=i;k<=j;k++){
                        
                        System.out.print(arr[k] +"  ");
                        sum+=arr[k];
                        }
                        System.out.println("sum is: " + sum);
                        if(sum>max_sum){
                            max_sum=sum;
                        }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("The maximum sum of subarray is: " + max_sum);
        }
        public static void main(String args[]){
            int arr[]={2,4,6,8,10,12};
            sub_arr(arr);
    
        }
        
    }
    

