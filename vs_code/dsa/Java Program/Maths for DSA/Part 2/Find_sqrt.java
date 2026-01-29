public class Find_sqrt {
    public static void main(String[] args) {
        int n = 470;
        System.out.println(sqrt(n));
    }

    public static double sqrt(int n) {
        int s = 0;
        int e = n;
        double ans = 0.0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        ans = e;

        double inc = 0.1;
        for (int i = 1; i <=3; i++) {
            while ((ans+inc) * (ans+inc) <= n) {
                ans = ans + inc;
            }
            inc = inc / 10;
        }
        return ans;
    }
}
