package Bit_wise_operator;

public class Find_the_no_of_set_bit {
    public static void main(String[] args) {
        int n = 11;
        int count = 0;
        
        // while(n>0){
        // if((n & 1)==1){
        // count++;
        // }
        // n=n>>1;
        // }
        // System.out.println(count);

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        System.out.println(count);
    }
}
