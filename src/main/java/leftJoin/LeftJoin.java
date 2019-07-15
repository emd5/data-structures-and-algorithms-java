package leftJoin;

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
}
