//page 853
import java.util.Stack;
import java.util.EmptyStackException;
public class StackTest {
    public static void main(String[] a){
        Stack<Integer> stack = new Stack<Integer>();
        
        //use push method
        stack.push(10);
        System.out.println("Pushed 10");
        printStack(stack);
        stack.push(20);
        System.out.println("Pushed 20");
        printStack(stack);
        stack.push(30);
        System.out.println("Pushed 30");
        printStack(stack);
        stack.push(40);
        System.out.println("Pushed 40");
        printStack(stack);
        stack.push(50);
        System.out.println("Pushed 50");
        printStack(stack);
        
        //remove items from stack
        try{
            Integer removedObject = null;
            
            while(true){
                removedObject = stack.pop();
                System.out.printf("Popped %s\n", removedObject);
                printStack(stack);
            }
        }
        catch(EmptyStackException e){
            e.printStackTrace();
        }
        
    }
    
    private static void printStack(Stack<Integer> stack){
        if(stack.isEmpty())
            System.out.println("stack is empty\n");
        else
            System.out.printf("Stack contains: %s (top)\n", stack);
    }
}
