import java.util.Scanner;

class TwentyFiveCount {

   public static void main(String[] args) {
    
      Scanner in = new Scanner(System.in);
    
      int num;
    
      boolean goon = true;
    
      int[] arrP = new int[26];
      int[] arrN = new int[26];

    
      System.out.println("Enter numbers");
    
    
      do {
      
         num = in.nextInt();
      
         if(num != 99){
         
            if(num <= 25 && num > 0) {
            
               arrP[num]++;
            }
            
            if(num >= -25 && num < 0) {
            
               arrN[Math.abs(num)]++;
            }
            
         }
         
         if(num == 99){
            goon = false;
         }
      
      }while(goon == true);
     
      for(int i=-25; i <= 25; i++) {
      
            if(i <= 25 && i > 0) {
            
               System.out.println(i + " was entered a total of " + arrP[i] + " times");
            }
            
            if(i >= -25 && i < 0) {
            
               System.out.println(i + " was entered a total of " + arrN[Math.abs(i)] + " times");
            }
      
      
      }
   
   
   }
}