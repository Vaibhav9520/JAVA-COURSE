import java.util.*;

import javax.swing.text.html.StyleSheet;
public class first {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert
        hm.put("India",100);
        hm.put("USA",91);
        hm.put("Pakishtan",50);
        hm.put("Nepal",20);
        hm.put("Uttar Pradesh",40);
        // System.out.println(hm);

        // //get
        // int population = hm.get("India");
        // System.out.println(population);
        // // continsKey
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Idia"));
    
        // //Remove
        // System.out.println(hm.remove("pakishtan"));
    
    //Iteration
    Set<String> keys = hm.keySet();
    System.out.println(keys);

    //use foreach loop
    for (String k : keys) {
        System.out.println("Keys = "+ k +", Values = "+hm.get(k));
        
    }
    
    
    
    }
}
