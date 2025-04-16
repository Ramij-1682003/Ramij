// import java.util.*;
public class array {

public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    }
}

    public static void main(String[] args) {
    
        // int[] marks = new int[5];
        // System.out.println(+marks.length);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the marks of 3 subjects");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage is: " + percentage+"%");

        int marks[]={93,98,96};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}