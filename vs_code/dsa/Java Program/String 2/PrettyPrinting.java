import java.util.*;

public class PrettyPrinting {
    public static void main(String[] args) {
        
        //place holders
        // float a=126.3597f;
        // System.out.printf("%.2f",a);

        //operators
        // System.out.println('a'+'b');
        // System.out.println("a"+"b");
        // System.out.println((char)('a'+3));

        // System.out.println(new Integer(1)+ " " +new ArrayList<>());
        // System.out.print(new Integer(1) + new ArrayList<>());

        //print a-z using string 
        // String s=new String();
        // for(int i=0;i<26;i++){
        //     char ch=(char)('a'+i);
        //     s+=ch;
        // }
        // System.out.println(s); //time complexity 0(n2)

        //print a-z using stringbuilder
        StringBuilder s= new StringBuilder();
        char ch;
        for(int i=0;i<26;i++){
            ch=(char)('a'+i);
           s.append(ch);
        }
        System.out.println(s);
    }
}
