 
import java.util.Scanner;

class TwentyFiveCountv2 {


   public static void main(String[] args) {
    
      Scanner in = new Scanner(System.in);
    
      int num;
    
      boolean goon = true;
    
      int[] arr = new int[51];
    
      System.out.println("Enter numbers");
    
    
      do {
      
         num = in.nextInt();
      
         if(num != 99){
            arr[num + 25]++;
         }
         if(num == 99){
            goon = false;
         }
      
      }while(goon == true);
     
      for(int i=0; i <= 50; i++) {
      
         System.out.println(i-25 + " was entered a total of " + arr[i] + " times");
      
      }    
    
   }

}
