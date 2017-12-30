import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14 {
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ListIterator<Integer> li=ll.listIterator();
        for(int i=0;i<10;i++){
            li.add(i);
            if(i%2==0)
                li.previous();
        }
        System.out.println(ll);
    }
}
