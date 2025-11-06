import java.util.HashMap;

public class valid_anagram {
    public static void main(String[] args) {
        String s="race";
        String t="care"; 
        
        HashMap<Integer,String> hm=new HashMap<>();
        HashMap<Integer,String> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(i, s.charAt(i)+ " ");
        }
        for(int i=0;i<s.length();i++){
            map.put(i, t.charAt(i)+ " ");
        }
             
        for(Integer k : hm.keySet()){ 
            if(map.containsKey(k) && hm.size()==map.size()){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}
