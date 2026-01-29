public class Range_of_prime_num {
    public static void main(String[] args) {
        int n = 100;
        boolean arr[] = new boolean[n + 1];
        // System.out.println(arr[3]);
        range(n, arr);
    }

    public static void range(int n, boolean arr[]) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == false) {
                for (int j = i * 2; j <= n; j = j + i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] == false)
                System.out.print(i + " ");
        }
    }
}
