package Bit_wise_operator;
import java.util.Scanner;

public class Find_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
        sc.close();;
    }
}
