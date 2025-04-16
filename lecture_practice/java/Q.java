import java.util.Scanner;

public class Q {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        if(1<=n && n<=40){
            for(int i=1;i<=10;i++){
                int result = n*i;
                System.out.println(n + " * " + i + " = " + result);
        }

    }
        int sum = 0;
        for(int i=1;i<=10;i++){
            int result = n*i;
            sum += result;
        }
        System.out.println( + sum);

    }
}
