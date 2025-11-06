import java.util.HashMap;

public class largest_sub_array_sun_zero {
    public static void main(String[] args) {
        int arr[]={15, -2, 2, -8, 1, 7, 10};
        // int arr[]={1, 2, 3};
        // int arr[]={1, 0, 3};
        
        // brute force approach
        // int maxlength1=0;
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum==0){
        //             maxlength1=Math.max(maxlength1, j-i+1);
        //         }
        //     }
        // }
        // System.out.println(maxlength1);

        // optimal approach 
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(-1, 0);
        int sum=0;
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                int j=hm.get(sum);
                maxlength=Math.max(maxlength, i-j);
            }
            else{
                hm.put(sum,i);
            }
        }
        System.out.println(maxlength);
    }
}
