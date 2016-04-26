/**
 * Design and implement an application that plays the Hi-Lo gueesing game with numbers.
 * The program should pick a random number between 1-100 (inclusive)
 * then keep asking the user to guess the number.
 *
 * On each guess, report correct, high, or low.
 * Use a sentinel value to determine whether the user wants to quit.
 * Count and report the number of guesses.
 * Give the user the option to play again.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

   public static void main(String[] args) {
   
      int num;
      int rnum;
      int hcount=0;
      int lcount=0;
      int Tcount=0;
      boolean playAgain = true;
      boolean playing = true;
      boolean InvInp = false;
      
      //generate random number
      Random rgen = new Random();
      rnum = rgen.nextInt(100)+1;
      
      Scanner inputnum = new Scanner(System.in);
      
      System.out.println("Hi-Lo Guessing Game!");
      
      while(playAgain) {

         hcount=0;
         lcount=0;
         Tcount=0;
         playAgain = true;
         playing = true;
         InvInp = false;
  
         rnum = rgen.nextInt(100)+1;
        
        // asks for user input
         System.out.println("");
         System.out.println("Please enter a number between 1 and 100.");
         System.out.print("> ");
        
         playing = true;
       
        
         while (playing) {
            
            num = inputnum.nextInt();
            InvInp = false;
            
           //Exit

            if (num <= 0 || num > 100) {
               Tcount = hcount + lcount;
            
               System.out.println("LOSER! The answer was " + rnum);
               System.out.println("");
            
               System.out.println("Total Guesses: " + Tcount);
               System.out.println("High Guesses: " + hcount);
               System.out.println("Low Guesses: " + lcount);
            
               System.out.println("");
            
               System.out.println("Would you like to play again? Yes or No?");
            
               Scanner again = new Scanner(System.in);
               String againstr = again.nextLine();
            
                  if(againstr.equalsIgnoreCase("y") || againstr.equalsIgnoreCase("yes")) {
                     InvInp = false;
                     playing = false;
                     System.out.println("Great! Here we go!");
                     playAgain = true;
                  }
                  
                  else if(againstr.equalsIgnoreCase("n") || againstr.equalsIgnoreCase("no")) {
                     playAgain = false;
                     System.out.println("Aww ok...Maybe we could play again some other time!");
                     System.exit(1);
                  }
                  
                  else {
                     InvInp = true;
                     System.out.println("Invalid Input. Try Again.");
                  }        

            }
            
         
           //True
            if (num == rnum) {
               
               //adds hcount + lcount for total count
               Tcount = hcount + lcount + 1;
            
               System.out.println("WINNER! The answer was " + num);
               System.out.println("");
            
               System.out.println("Total Guesses: " + Tcount);
               System.out.println("High Guesses: " + hcount);
               System.out.println("Low Guesses: " + lcount);
            
               System.out.println("");
            
               System.out.println("Would you like to play again? Yes or No?");
            
               Scanner again = new Scanner(System.in);
               String againstr = again.nextLine();
            
                  if(againstr.equalsIgnoreCase("y") || againstr.equalsIgnoreCase("yes")) {
                     InvInp = false;
                     playing = false;
                     System.out.println("Great! Here we go!");
                     playAgain = true;
                  }
                  
                  else if(againstr.equalsIgnoreCase("n") || againstr.equalsIgnoreCase("no")) {
                     playAgain = false;
                     System.out.println("Aww ok...Maybe we could play again some other time!");
                     System.exit(1);
                  }
                  
                  else {
                     InvInp = true;
                     System.out.println("Invalid Input. Try Again.");
                  }        
            }
         
           //False
            if (num != rnum && playing == true && InvInp == false){
            
               //high
               if (num>rnum && playing == true && InvInp == false) {
                  System.out.println("WRONG! Your guess was too high!");
                  hcount++;
               }
            
               //low
               if (num<rnum && playing == true && InvInp == false) {
                  System.out.println("WRONG! Your guess was too low!");
                  lcount++;
               }
            
               // asks for user input
               System.out.println("Please try again.");
               System.out.print("> ");
            }
   
         }
   
      }
   }
}
