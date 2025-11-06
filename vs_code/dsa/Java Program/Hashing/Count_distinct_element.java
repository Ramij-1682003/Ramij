import java.util.HashSet;

public class Count_distinct_element {
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,3,1};
        HashSet<Integer>hs=new HashSet<>();
        for(Integer i:num){
            hs.add(i);
        }
        System.out.println(hs.size());
    }
}
