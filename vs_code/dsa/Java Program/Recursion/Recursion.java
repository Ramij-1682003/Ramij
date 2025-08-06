public class Recursion {
   
    //print the numbers from 1 to n using recursion
   
    //decreasing order
    public static void num1(int n){
        if(n==1){
        System.out.println(n);
        return;
        }
        System.out.print(n+" ");
        num1(n-1);
    }

    //increasing order
    public static void num2(int n) {
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.println(n);
        num2(n+1);
        
    }

    //factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }

    //Sum of n mumbers
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }

    //nth Fibonacci number
    public static int  fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    //given array is shorted or not
    public static boolean sort(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        } 
        return sort(arr, i+1);
    }

    //find the first occurance of a number in an array
    public static int index_first(int arr[],int i,int a){
        if(i==arr.length-1){
            return 0;
        }
        if(arr[i]==a){
            return i;
        }
        return index_first(arr, i+1, a);
    }


    public static int index_last(int arr[],int i,int a){
        if(i==0){
            return -1;
        }
        if(arr[i]==a){
            return i;
        }
        return index_last(arr, i, a);
    }

    
    // public static int power(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return x * power(x, n-1);
    // }
    
    //optimized
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int a= power(x, n/2);
        if(n%2==0){
            return a*a;
        }
        else{
            return x * a*a;
        }
    }

    //tilling problem
    public static int tiling(int n){
        if (n==0 || n==1){
            return 1;
        }
        return tiling(n-1) + tiling(n-2);
        
    }

    //removal of dublicate letters from a string 
    public static void dublicate(String str,int i, String result){
       if(i==str.length()){
        return;
       }
       
       String ch=""+str.charAt(i); //like 'a'+""-> "a"
       if(!result.contains(ch)){ 
            result+=ch;
            System.out.print(ch);
        }
        
        dublicate(str, i+1, result);
    }

    //pairing
    public static int pairing(int n){
        if(n==0||n==1){
            return 1;
        }
        return pairing(n-1)+pairing(n-1)*pairing(n-2);
    }

    //binary string problem
   public static void binary_string(int n, String str, int prev) {
    if (n == 0) {
        System.out.println(str);
        return;
    }


    binary_string(n - 1, str + "0", 0);

    
    if (prev == 0) {
        binary_string(n - 1, str + "1", 1);
    }
}

    public static void main(String []args){
        // int n=10;
        // num1(n);
        
        // int n=1;
        // num2(1);
        
        // int n=8;
        // System.out.println(fact(n));

        // int n=10;
        // System.out.println(sum(n));
    
        // int n=10;
        // System.out.println(fib(n));

        // int arr[]={1,2,3,9,10};
        // int i=0;
        // System.out.println(sort(arr, i));

        // int arr[]={1,2,10,3,5,7,2,3};
        // int i=0;
        // int i=arr.length-1;
        // int a=3;
        // System.out.println(index_first(arr, i, a));
        // System.out.println(index_last(arr, i, a));

        // int x=2;
        // int n=40;
        // System.out.println(power(x, n));

        // int n=5;
        // System.out.println(tiling(n));

        // String str="abcdeefghijjklmnooppqrrsttuuvvwwxxyyzaz";
        // int i=0;
        // String result="";
        // dublicate(str,i,result); 
        
        // int n=3;
        // System.out.println(pairing(n));

        int n=3;
        // String str="";
        // int prev=0;
        binary_string(n, "", 0);
    }
}
