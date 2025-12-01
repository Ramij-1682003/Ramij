public class Palindrome {
    public static void main(String[] args) {
        String s="";
        System.out.println(is_palindrome(s));
    }

    public static boolean is_palindrome(String s){
        if(s==null || s.length()==0){
            return true;
        }
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
