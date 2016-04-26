import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
   
   ArrayList<Card> cardArray = new ArrayList<Card>();
   
   DeckOfCards(){
      
      /// creates suits
      for(int i = 1; i <= 4; i++) {
      
            //creates values
         for(int j = 1; j <= 13; j++) {
            
            Card rCard = new Card(j, i);
            
            cardArray.add(rCard);
            
         }
      }
   }
   
   public void shuffle() {
   
      Collections.shuffle(cardArray);

   }
   
   public String deal() {
   
      String result = cardArray.get(0).getCardResult();
      
      cardArray.remove(0);
      
      return result;
   }
   
   public int cardsLeft() {
   
      return cardArray.size()-1;     
   } 

}