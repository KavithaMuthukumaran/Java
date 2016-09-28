import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class Algorithms1 {
    
    public static void main(String[] args){
        Character[] letters = {'P','C','M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("List contains");
        output(list);
        
        Collections.reverse(list);
        System.out.println("After calling reverse the List contains: ");
        output(list);
        
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);
        
        //copy the contents of list into copyList
        Collections.copy(copyList, list);
        System.out.println("After copying the copyList contains: ");
        output(copyList);
        
        //Fill the list with Rs
        Collections.fill(list, 'R');
        System.out.println("After filling with R the list contains: ");
        output(list);
                
    }
    
    private static void output(List<Character> listRef){
        System.out.print("The list is: ");
                
        for(Character element : listRef)
           System.out.printf("%s ", element);
        
        System.out.printf("\nMax: %s", Collections.max(listRef));
        System.out.printf("\nMin: %s\n", Collections.min(listRef));
    }
}
