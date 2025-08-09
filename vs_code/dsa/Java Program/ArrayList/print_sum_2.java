import java.util.ArrayList;

public class print_sum_2 {
    public static boolean print_sum(ArrayList<Integer> list,int target){
        int i=0;
        int j =0;
         int n=list.size();
        for(int k=0;k<n-1;k++){
            if(list.get(k)>list.get(k+1)){
                i=k+1;//first index
                j=k;//last index
                break;
            }
        }
        while(i!=j){   // for rotated array 
            int sum=list.get(i)+list.get(j);
            if(sum==target){
                return true;
            }if(sum<target){
                i=(i+1)%n;
            }else{
                j=(n+j-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(print_sum(list, 16));
    }
}
