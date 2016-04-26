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
      int tcount=0;
      boolean playAgain = true;
      boolean playing = true;
      
      
      //generate random number
      Random rgen = new Random();
      rnum = rgen.nextInt(100)+1;
      
      Scanner inputnum = new Scanner(System.in);
      
      while(playAgain) {

         hcount=0;
         lcount=0;
         tcount=0;
         playAgain = true;
         playing = true;
  
         rnum = rgen.nextInt(100)+1;
        
        // asks for user input
         System.out.println("Please enter a number between 1 - 100");
         System.out.print("> ");
        
         playing = true;
       
        
         while (playing) {
            
            num = inputnum.nextInt();
            
           //Exit
            if (num == 0) {
               tcount = hcount + lcount;
            
               System.out.println("LOSER! You have quit the game! The answer was " + rnum);
               System.out.println("---");
            
               System.out.println("Total Guesses: " + tcount);
               System.out.println("High Guesses: " + hcount);
               System.out.println("Low Guesses: " + lcount);
            
               System.out.println("");
            }
         
           //True
            if (num == rnum) {
               
               //adds hcount + lcount for total count
               tcount = hcount + lcount + 1;
            
               System.out.println("WINNER! The answer was " + num);
               System.out.println("---");
            
               System.out.println("Total Guesses: " + tcount);
               System.out.println("High Guesses: " + hcount);
               System.out.println("Low Guesses: " + lcount);
            
               System.out.println("");
            
               System.out.println("Would you like to play again? [Y/N]");
            
               Scanner again = new Scanner(System.in);
               String againstr = again.nextLine();
            
                  if(againstr.equalsIgnoreCase("y")) {
                     playing = false;
                     playAgain = true;
                  }
                  
                  else if(againstr.equalsIgnoreCase("n")) {
                     playAgain = false;
                     System.exit(1);
                  }
                  
                  else{
                     System.out.println("Invalid Input");
                  }        
            }
         
           //False
            if (num != rnum){
            
               //high
               if (num>rnum) {
                  System.out.println("WRONG! Your guess was too high");
                  hcount++;
               }
            
               //low
               if (num<rnum) {
                  System.out.println("WRONG! Your guess was too low");
                  lcount++;
               }
            
               // asks for user input
               System.out.println("Please try again");
               System.out.print("> ");
            }
   
         }
   
      }
   }
}
