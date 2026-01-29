package Bit_wise_operator;

public class nth_Magic_number {
    public static void main(String[] args) {
        int n=6;
        int ans=0;
        int mask=1;
        int pow=5;
        while(n>0){
            
            int last=n & mask;
            n=n>>1;
            ans=ans+pow*last;
            pow=pow*5;
        }
        
        System.out.println(ans);
    }   
}
