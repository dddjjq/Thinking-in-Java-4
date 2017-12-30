import java.util.*;

public class Ex11 {
    public static void main(String[] args){
        Ex11 ex11=new Ex11();
        ArrayList<Integer> al=new ArrayList<>();
        Set<Integer> hs=new HashSet<>();
        LinkedHashSet<Integer> lh=new LinkedHashSet<>();
        for(int i=0;i<10;i++){
            al.add(i);
            hs.add(i);
            lh.add(i);
        }
        ex11.forEach(al);
        ex11.forEach(hs);
        ex11.forEach(lh);
    }
    public void forEach(Collection<Integer> c){
        Iterator<Integer> it=c.iterator();
        while(it.hasNext()){
            System.out.print(it.next().toString()+" ");
        }
        System.out.println();
    }
}
