import java.util.*;
public class subarray_sum_equals_k {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        // int arr[]={10,2,-2,-20,-10};

        // bruteforce approach
        // Scanner sc=new Scanner(System.in);
        // int k=sc.nextInt();
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[i];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        //optimal approach
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0, 1);
        int sum=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum, 0)+1);
            
        }
        System.out.println(count);
    }
}
