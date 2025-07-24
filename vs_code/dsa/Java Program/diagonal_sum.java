public class diagonal_sum {
    public static void main(String[] args) {
        int arr[][]={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int sum2=0;
        int sum1=0;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                if(i==j){
                    sum1+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sum2+=arr[i][j];
                }
                
            }
        }
        System.out.println("sum1(principal diagonal): "+sum1);
        System.out.println("sum2(off diagonal): "+sum2);
    }
}
