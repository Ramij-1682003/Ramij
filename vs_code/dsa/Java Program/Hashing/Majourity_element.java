import java.util.HashMap;

public class Majourity_element {
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};
        int n= nums.length;
        HashMap<Integer,Integer>arr=new HashMap<>();

        for(int i=0;i<n;i++){
            int a=nums[i];
             
            // if(arr.containsKey(a)){
            //     arr.put(a, arr.get(a)+1);
            // }
            // else{
            //     arr.put(a, 1);
            // }

            arr.put(a , arr.getOrDefault(a,0)+1);
        }
        
        for(Integer key: arr.keySet()){
            if(arr.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
}
