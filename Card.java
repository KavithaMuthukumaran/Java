import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class Card {
    
    public static enum Face{Ace, Duce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
    public static enum Suit{Clubs, Diamonds, Hearts, Spades};
    public final Face face;
    public final Suit suit;
    
    public Card(Face cardFace, Suit cardSuit){
        face = cardFace;
        suit = cardSuit;
    }
    
    public Face getFace(){
        return face;
    }
    
    public Suit getSuit(){
        return suit;
    }
    
    @Override
    public String toString(){
        return String.format("%s of %s", face, suit);
    }
}
