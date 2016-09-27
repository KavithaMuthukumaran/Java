import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class DeckofCards {
    
    private List<Card> list;
    
    public DeckofCards(){
        Card[] dec = new Card[52];
        int count = 0;
        
        //populate deck with card objects
        for(Card.Suit suit : Card.Suit.values()){
            for(Card.Face face : Card.Face.values()){
                dec[count] = new Card(face, suit);
                ++count;
            }
        } 
        list = Arrays.asList(dec);
        Collections.shuffle(list);
    }
    
    public void printCards(){
        for(int i = 0; i < list.size(); i++)
            System.out.printf("%-19s%s", list.get(i),((i+1)%4 == 0 ? "\n" : " "));
    }
    
    public static void main(String[] args){
        DeckofCards cards = new DeckofCards();
        cards.printCards();
    }
    
    
}
