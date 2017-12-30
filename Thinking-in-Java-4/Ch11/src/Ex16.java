import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ex16 {
    public static void main(String[] args){
        ArrayList<Character> al=new ArrayList<>();
        File file=new File("G:\\github_java\\Thinking-in-Java-4\\Ch11\\src\\Stack.java");
        try {
            InputStream is = new FileInputStream(file);
            while(is.read()!=-1) {
                al.add((char)(is.read()));
            }
            for(int i=0;i<al.size();i++)
                System.out.print(al.get(i));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
