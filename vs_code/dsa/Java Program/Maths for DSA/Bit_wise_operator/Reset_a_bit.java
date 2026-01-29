package Bit_wise_operator;

import java.util.Scanner;

public class Reset_a_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        a = a & ~(1 << (i - 1));
        System.out.println(a);
        sc.close();
    }
}
