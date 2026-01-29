import java.util.*;
public class Primenum {
    
    public static boolean prime(int n) {
        if(n==1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=36;
        System.out.println(prime(n));
    }
}

