//page 858
//Using SortedSets and TreeSets.
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetTest {
    public static void main(String[] args){
        String[] colors = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};
        SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colors));
        
        System.out.print("Sorted set: ");
        printSet(tree); //output contents of the tree
        
        //get headSet based on "orange"
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));
        
        //get tailSet based on "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));
        
        
        //get the first and the last element
        System.out.printf("first: %s\n", tree.first());
        System.out.printf("last: %s\n", tree.last());
    }
    
    public static void printSet(SortedSet<String> set){
        for(String s : set)
            System.out.printf("%s ", s);
        
        System.out.println();
    }
    
}
