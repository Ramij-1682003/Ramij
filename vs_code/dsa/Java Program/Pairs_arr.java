public class Pairs_arr {
public static void pairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" +arr[i]+" "+arr[j] +")");
                tp++;
            }
        System.out.println();
        }
        System.out.println("Total pairs are: "+tp);
    }
public static void main(String args[]){
    int arr[]={2,4,6,8,10,12};
    pairs(arr);
    }
}
