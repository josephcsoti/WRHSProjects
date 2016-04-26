import java.util.Random;
import java.text.NumberFormat;

class MonetaryCoinDriver {

   int coinVal;
  

   public static void main(String[] args) {

      
      int currentVal;
      int totalVal = 0;
      
      int NUMBER_OF_COINS = 25;
      
      Random rgen = new Random();
      
      for(int i=1; i <= NUMBER_OF_COINS; i++) {
      
         currentVal = Convert(rgen.nextInt(4)+1);
         MonetaryCoin coinX = new MonetaryCoin(currentVal);
         coinX.flip();
         
         if(coinX.isHeads()){
            
            totalVal = totalVal + currentVal;
         }
         
         
         if(i<10){
            
            if(currentVal <= 5){
               System.out.println("Coin " + i + ":  " + coinX.toString() + " -  " + currentVal + "¢");
            }
         
            if(currentVal > 5){
               System.out.println("Coin " + i + ":  " + coinX.toString() + " - " + currentVal + "¢");
            }
         
         }
         
         if(i>10){
         
            if(currentVal <= 5){
               System.out.println("Coin " + i + ": " + coinX.toString() + " -  " + currentVal + "¢");
            }
         
            if(currentVal > 5){
               System.out.println("Coin " + i + ": " + coinX.toString() + " - " + currentVal + "¢");
            }
         }
         
      }
      
      double totalValConverted = totalVal / 100.0;
      
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      
      System.out.println("---------------------" + "\nTotal:         " + formatter.format(totalValConverted));
      
      
   }
   
   
   public static int Convert(int v) {
   
      switch (v) {
            case 1:  return 1;

            case 2:  return 5;

            case 3:  return 10;
              
            case 4:  return 25;

            default: return 0;
   }
   
}
}