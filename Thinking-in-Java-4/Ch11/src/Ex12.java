import java.util.LinkedList;
import java.util.ListIterator;

public class Ex12 {
    public static void main(String[] args){
        LinkedList<Integer> ll1=new LinkedList<>();
        LinkedList<Integer> ll2=new LinkedList<>();
        for(int i=0;i<10;i++){
            ll1.add(i);
        }
        ListIterator<Integer> li=ll1.listIterator(ll1.size());
        while(li.hasPrevious())
            ll2.add(li.previous());
        System.out.println(ll1);
        System.out.println(ll2);
    }
}
