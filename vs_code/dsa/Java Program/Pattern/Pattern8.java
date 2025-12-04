public class Pattern8 {
    public static void main(String[] args) {
        pattern8(4);
    }

    public static void pattern8(int n) {
        n = 2 * n;

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int num1 = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                int num = n - num1;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
