public class DealCards {

   public static void main(String[] args) {
   
      DeckOfCards deck = new DeckOfCards();
      
      System.out.println("Deck Dealer");
      System.out.println("---");
      
      deck.shuffle();
      
      while(deck.cardArray.size()-1 > 0){
      
         String result = deck.deal();
         
         System.out.println(result);
         System.out.println(deck.cardsLeft());

      }
      
      
   }
   
   

}