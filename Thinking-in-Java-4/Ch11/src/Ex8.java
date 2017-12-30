import java.util.ArrayList;
import java.util.Iterator;

public class Ex8 {
    public static void main(String[] args){
        ArrayList<Gerbil> al=new ArrayList<>();
        for(int i=0;i<10;i++){
            al.add(new Gerbil(i));
        }
        System.out.println(al.size());
        Iterator<Gerbil> it=al.iterator();
        while(it.hasNext()){
            Gerbil ge=it.next();
            ge.hop();
        }
    }
}
