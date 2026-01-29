package Bit_wise_operator;

public class Find_the_power {
    public static void main(String[] args) {
        int base=3;
        int pow=3;
        int ans=1;
        while(pow>0){
            if ((pow&1)==1) {
                ans=ans*base;
            }
            base=base*base;
            pow=pow>>1;
        }
        System.out.println(ans);
    }
}
