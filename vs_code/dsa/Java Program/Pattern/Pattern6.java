//     X 
//    X X 
//   X X X 
//  X X X X 
// X X X X X 
//  X X X X 
//   X X X 
//    X X 
//     X 

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    public static void pattern6(int n) {

        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("X ");
            }
            System.out.println();
        }

        for (int row = n - 1; row >= 1; row--) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
