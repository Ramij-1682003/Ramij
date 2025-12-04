// 1                   
// 1 2 
// 1 2 3 
// 1 2 3 4 

public class Pattern4 {
    public static void main(String[] args) {
        // pattern4_1(10);
        pattern4_2(11);
    }

    public static void pattern4_1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10

    public static void pattern4_2(int n) {
        int a = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
