import java.util.*;

public class Ex4 {
    public static final Create create=new Create();
    public static String[] fill(String[] array){
        for(int i=0;i<array.length;i++)
            array[i]=create.next();
        return array;
    }
    public static Collection<String> fill(Collection<String> c){
        for(int i=0;i<5;i++){
            c.add(create.next());
        }
        return c;
    }
    public static void main(String[] args){
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<>()));
    }
}

class Create{
    String[] characters = {
            "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
            "Bashful", "Snow White", "Witch Queen", "Prince"
    };
    int next;
    public String next(){
        String r=characters[next];
        next=(next+1)%characters.length;
        return r;
    }
}
