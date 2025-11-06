import java.util.*;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(); // declear hashmap

        // insert values
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Pakistan", 50);

        // System.out.println(hm);
        // System.out.println(hm.get("India"));
        // System.out.println(hm.containsKey("India"));
        // hm.remove("India");
        // System.out.println(hm);
        // System.out.println(hm.get("India"));

        // Iteration in hashmap
        Set<String> keys = hm.keySet(); // take all the keys from the hashmap and store them in keys
        for (String k : keys) {
            System.out.println(k + " = " + hm.get(k)); // print values of each key
        }
    }
}
