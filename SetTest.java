//page 857
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest {
    
    public static void main(String[] a){
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan" ,"white", "cyan", "peach","gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s\n", list);
        printNoDuplicateList(list);
    }
    
    public static void printNoDuplicateList(Collection<String> values){
        Set<String> set = new HashSet<String>(values);
        System.out.print("\nNon duplicates are: ");
        
        for(String value : set)
            System.out.printf("%s ", value);
        
        System.out.println();
        
    }
}
