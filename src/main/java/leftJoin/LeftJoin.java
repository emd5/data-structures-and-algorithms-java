package leftJoin;

import hashTable.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {

    public static List<String> leftJoin(HashMap h1, HashMap h2){

        List<String> list = new ArrayList<>();
        for(Object k : h1.keySet()){
            if(h1.containsKey(k)){
                list.add(k +  ": " + h1.get(k)+ ", " + h2.get(k));
            } else{
                list.add(k + ": " + h1.get(k) + ", " + null);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap h2 = new HashMap();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("flow", "jam");

        System.out.println(LeftJoin.leftJoin(h1, h2));
    }


}
