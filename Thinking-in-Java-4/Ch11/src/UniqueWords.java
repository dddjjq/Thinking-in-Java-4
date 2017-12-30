import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;

public class UniqueWords {
    public static void main(String[] args){
        Set<String> words=new TreeSet<String>(new TextFile("G:/github_java/Thinking-in-Java-4/Ch11/src/Stack.java","\\w+"));
        System.out.println(words);
    }

}
