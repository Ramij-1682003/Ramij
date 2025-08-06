import java.util.*;
public class string {
    // public static boolean palindrome(String a) {
    //     int i=0; int j=a.length()-1;
        
    //     while(i<j){
    //         if(a.charAt(i)!=a.charAt(j)){
    //             return false;
    //         }else{
    //             i++;
    //             j--;
    //         }
    //     }
    //     return true;
    // }
//     public static void shortest_path(String a){
//         int x=0, y=0;
//         for(int i=0;i<a.length();i++){
//         if(a.charAt(i)=='N'){
//             y+=1;
//         }else if(a.charAt(i)=='S'){
//             y-=1;
//         }else if(a.charAt(i)=='E'){
//             x+=1;
//         }else if(a.charAt(i)=='W'){
//             x-=1;
//         }
//     }
//         System.out.println("The shortest path is: "+x+" "+y);
//         int x2=x*x;
//         int y2=y*y;
//         System.out.println("The distance is: "+Math.sqrt(x2+y2));
// }

    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // String str;
        // // str=sc.next();
        // str=sc.nextLine();
        // System.out.println("The string is: "+str);

        // String length
    //     String str1="Ramij";
    //     System.out.println(str1.length());

    //Concatination
    // String name1="Ramij";
    // String name2="Ikbal";
    // System.out.print(name1 + " " + name2);

    // Print characters in string
        // String str="Ramij Ikbal";
        // for (int i=0;i<str.length();i++){
        //     System.out.print(str.charAt(i));
        // }

     // Palindrome check
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        // a=a.toLowerCase();
    
        // if(palindrome(a)== true){
        //     System.out.println("The string is palindrome");
            
        // }
        // else{
        //     System.out.println("The string is not palindrome");
        // }
    
        //Shrotest path
        // shortest_path(a);

        //largest string
        // String b=sc.next();
        // if(a.compareToIgnoreCase(b)>0){
        //     System.out.println("The largest string is: "+a);
        // }
        // else{
        //     System.out.println("The largest string is: "+b);
        // }

        // Convert each fo=irst letter of each word to upper case
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<a.length();i++){
            if(a.indexOf(i)==0){
            sb.append(Character.toUpperCase(a.charAt(i)));
            }
            else if(a.charAt(i)== ' '){
                sb.append(a.charAt(i));
                i++;
                sb.append(Character.toUpperCase(a.charAt(i)));
            }
        }
    System.out.println(sb.toString());

    }

}
