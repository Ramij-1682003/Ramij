package Bit_wise_operator;

public class Find_The_Position_Of_Right_Most_Set_Bit {

    public static int find_set_bit(int n) {

        // int mask=1;
        // int pos=0;

        if(n == 0) {
            return -1;
        }

        // while((n & mask)==0){
        // mask=mask<<1;
        // pos++;
        // }
        // return pos+1;

        // optimal solution
        return (int) (Math.log10(n ^ (n & (n - 1))) / Math.log10(2)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(find_set_bit(4));
    }
}
