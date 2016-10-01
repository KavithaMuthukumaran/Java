import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class PropertiesTest {
    public static void main(String[] a){
        Properties table = new Properties();
        //set properties
        table.setProperty("color","blue");
        table.setProperty("width", "200");
        
        System.out.println("After setting properties");
        listProperties(table);
        saveProperties(table);
        
        table.clear();
        System.out.println("Ater clearing the table");
        listProperties(table);
        
        loadProperties(table);
        
        Object value = table.getProperty("color");
        if(value != null)
            System.out.printf("property color's value is %s\n", value);
        else
            System.out.println("Property color is not in table");
    }
    
    private static void listProperties(Properties table){
        Set<Object> keys = table.keySet();
        for(Object key : keys)
            System.out.printf("%s\t%s\n", key, table.getProperty((String) key));
        
        System.out.println();
    }
    
    private static void saveProperties(Properties table){
        try{
            FileOutputStream output = new FileOutputStream("C:\\Users\\WINDOWS\\Desktop\\props.txt");
            table.store(output, "Sample properties");
            output.close();
            System.out.println("After saving properties");
            listProperties(table);
            
            loadProperties(table);
        }
        catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
    
    private static void loadProperties(Properties table){
        try{
            FileInputStream input = new FileInputStream("C:\\Users\\WINDOWS\\Desktop\\props.txt");
            table.load(input);
            input.close();
            System.out.println("After loading properties");
            listProperties(table);
        }
        catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
}
