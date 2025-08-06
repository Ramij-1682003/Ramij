public class Sub_arr {
    public static void sub_arr(int arr[]){
        int ta=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                ta++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays are: "+ta);

    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12};
        sub_arr(arr);

    }
    
}
