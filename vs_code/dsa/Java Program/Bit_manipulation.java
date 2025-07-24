import java.util.*;
public class Bit_manipulation {
    public static void main(String[] args) {
        // System.out.println(5<<2);
        // System.out.println(6>>1);
        
        // Even odd check
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // if((a&1)==1){
        //     System.out.println("odd");
        // }else{
        //     System.out.println("even");
        // }        

        //find the ith bit        
        // int i=sc.nextInt();
        // if((a & (1<<i))==0){
        //     System.out.println("ith bit is 0");
        // }else{
        //     System.out.println(" ith bit is 1");
        // }

        // set the ith bit
        // int j=(a | (1<<i));
        //System.out.println(j);
        
        //clear the ith bit
        // int k=(a & ~(1<<i));
        //System.out.println(k);

        //clear i th bit
        // int l=(a & ~(1<<i));
        // int j=sc.nextInt();
        // System.err.println(l | (j<<i));

        //Clear last i bits
        // System.out.println( a & (-1<<i));

        //Clear range of bits
        // int i=sc.nextInt();
        // int j=sc.nextInt();
        // int left =(-1)<< (j+1);
        // int right = (1<<i)-1;   
        // int mask = left | right;
        // int ans = a & mask; 
        // System.out.println(ans);

        //Check if a number is power of 2
        // if((a & (a-1))==0){
        //     System.out.println("power of 2");
        // }else{
        //     System.out.println("not power of 2");
        // }

        //Count number of 1's in a number
        int count =0;
        while(a>0){
        count+=a&1;
        a=a>>1;  

    }
    System.out.println(count);

        
}
}