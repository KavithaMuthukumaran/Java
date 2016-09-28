//page 850
//Collections method binarySearch
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest {
    
    public static void main(String[] a){
        
        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = Arrays.asList(colors);
        
        System.out.printf("Contents of the unsorted list are: %s\n", list);
        Collections.sort(list);
        System.out.printf("Contents of the sorted list are: %s\n", list);
        printSearchResults(list, colors[0]);
        printSearchResults(list, colors[3]);
        printSearchResults(list, colors[7]);
        printSearchResults(list, "tan");
        printSearchResults(list, "hai");
       
    }
    
    //perform search and print results
    private static void printSearchResults(List<String> list, String key){
        int result = 0;
        
        System.out.printf("\nSearching for :%s\n", key);
        result = Collections.binarySearch(list, key);
        
        if(result >= 0)
            System.out.printf("Found at index %d\n", result);
        else
            System.out.printf("Not found %d\n", result);
    }
}
