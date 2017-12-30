import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex17 {
    public static void main(String[] args){
        Map<String,Gerbil> gerbil=new HashMap<>();
        gerbil.put("Fuzzy",new Gerbil(1));
        gerbil.put("Spot",new Gerbil(2));
        gerbil.put("Joe",new Gerbil(3));
        Iterator<Entry<String,Gerbil>> it=gerbil.entrySet().iterator();
        while(it.hasNext())
            it.next().getValue().hop();
    }
}
