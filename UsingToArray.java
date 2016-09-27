//page 840
//Converts the array to LinkedList and vice versa
import java.util.LinkedList;
import java.util.Arrays;
public class UsingToArray {
    public static void main(String[] a){
        
        String[] colors = {"black","blue","yellow"};
        
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(colors));
        
        list.add("black");
        list.add("white");
        
        System.out.println("Print the list");
        for(String color : list)
            System.out.println(color); 
        
        colors = list.toArray(new String[list.size()]);
        System.out.println("print the array");
        for(String color : colors)
            System.out.println(color);
        
    }
}
