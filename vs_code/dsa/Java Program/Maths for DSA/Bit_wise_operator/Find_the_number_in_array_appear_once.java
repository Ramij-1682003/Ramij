package Bit_wise_operator;

public class Find_the_number_in_array_appear_once {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 4, 6, 4, 6 };
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        System.err.println(ans);
    }
}
