import java.util.*;

public class Ex18 {
    public static void main(String[] args){
        Map<String,Integer>  map=new HashMap<>();
        map.put("first",1);
        map.put("second",2);
        map.put("third",3);
        map.put("fourth",4);
        System.out.println(map);
        Map<String,Integer> lm=new LinkedHashMap<String,Integer>();
        String[] keys=map.entrySet().toArray(new String[3]);
        Arrays.sort(keys);
        for(String key:keys)
            lm.put(key,map.get(key));
        System.out.println(lm);
    }
}
