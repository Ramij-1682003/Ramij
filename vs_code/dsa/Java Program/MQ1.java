import java.util.Scanner;

public class MQ1 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        
        int result=0;
        if(1<=n && n<=40){
            for(int i=1;i<=10;i++){
               result+=(n*i);
            }
            System.out.println(result);

        }
        else{
            System.out.println("invalid input ");
        }
        
        

    }
}

