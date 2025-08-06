public class permutation {
    public static void permutations(String str,String ans){
       
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
       
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String c= ans + ch;
            String rest=str.substring(0,i)+str.substring(i+1,str.length());
            permutations(rest, c);
        }
    }
    public static void main(String []args){
        String str="abc";
        permutations(str,"");
    }
}
