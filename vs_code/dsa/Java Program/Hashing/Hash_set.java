import java.util.HashSet;
// import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(null);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        // System.out.println(hs);
        
        // Iterator<Integer> i=hs.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        for(Integer i: hs){
            System.out.println(i);
        }
    }
}
