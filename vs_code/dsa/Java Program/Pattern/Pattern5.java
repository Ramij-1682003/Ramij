public class Pattern5 {
    static int col;

    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int n){
        for(int row=1;row<2*n;row++){
            int col1=0;
            if(row>n){
                col1=2*n-row;    
            }else{
                col1=row;
            }

            for(int col=col1;col>=1;col--){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
