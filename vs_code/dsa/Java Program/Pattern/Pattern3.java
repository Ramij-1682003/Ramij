// x x x x 
// x x x 
// x x 
// x 

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(10);
    }

    public static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
