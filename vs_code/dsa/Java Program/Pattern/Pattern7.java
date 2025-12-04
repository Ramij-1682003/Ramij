//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1;col-- ) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
            System.out.print(col);
            }
            
            System.out.println();
        }

        for (int row = n-1; row >= 1; row--) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1;col-- ) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
            System.out.print(col);
            }
            
            System.out.println();
        }
    }
}
