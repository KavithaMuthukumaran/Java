//page 843
//Using a comparator object with method sort
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 {
    
    public static void main(String[] a){
        
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        //In this case what will be the object that will be stored in list variable ?
        //Will it be a ArrayList or LinkedList ?
        //In any case that is not relevent. because only the mentods of List class can be applied on the object
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsported array elements: %s\n", list);
        
        //sort in descending order using a Comparator
        //What is the comparator that is used here ?
        //I am unable to understand this step.
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted in reverseOrder: %s\n", list);
    }
}
