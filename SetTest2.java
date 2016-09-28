//page 857
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest2 {
    
    public static void main(String[] a){
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan" ,"white", "cyan", "peach","gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s\n", list);
        Set<String> set = new HashSet<String>(list);
        System.out.printf("Without duplicates %s", set);
    }
    
}
