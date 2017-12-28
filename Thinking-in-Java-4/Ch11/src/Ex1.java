import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args){
        ArrayList<Gerbil> al=new ArrayList<>();
        for(int i=0;i<10;i++){
            al.add(new Gerbil(i));
        }
        for(int j=0;j<10;j++){
            al.get(j).hop();
        }
    }
}
class Gerbil{
    int gerbilNumber;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber=gerbilNumber;
    }
    public void hop(){
        System.out.println("Gerbil numer is: "+gerbilNumber);
    }
}
