/**
 * Write an application that rolls a die and displays the result.
 * Let the user pick the number of sides on the die.
 * Use the Die class from the common folder to represent the die in your program.
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DiceRoll {

    public static void main(String[] args) throws InterruptedException {
    
        boolean rollAgain = false;

        System.out.println("Dice Roll");
        System.out.println("---");

        System.out.println("1: Normal Die");
        System.out.println("2: Custom Die");

        System.out.print("> ");
        
        Scanner ra = new Scanner(System.in);
        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        Die die = new Die();

        if (choice == 1){

            die = new Die();

            System.out.println("A 6-sided die has been created");
        }

        else if (choice == 2){

            System.out.print("Number of Sides: ");
            int faces = input.nextInt();

            die = new Die(faces);

            if(faces < 4) {
                System.out.println("A die with " + faces + " sides is IMPOSSIBLE");
                System.out.println("A 6-sided die has been created instead");
            }

            else {
                System.out.println("A " + faces + "-sided die has been created");
            }

        }

        do{
        
           die.roll();
        
           int value = die.getFaceValue();
   
           TimeUnit.MILLISECONDS.sleep(250);
           System.out.print("Rolling");
           TimeUnit.MILLISECONDS.sleep(500);
           System.out.print(".");
           TimeUnit.MILLISECONDS.sleep(500);
           System.out.print(".");
           TimeUnit.MILLISECONDS.sleep(500);
           System.out.print(".");
           TimeUnit.MILLISECONDS.sleep(500);
           System.out.print(".");
           TimeUnit.MILLISECONDS.sleep(500);
           System.out.println(".");
   
           System.out.println("Result: " + value);
           
           System.out.println("Roll Again? [Y/N]");
           char c = ra.nextLine().toLowerCase().charAt(0);
           
           if ( c == 'y' ) {
           
               rollAgain = true;
           }
           else if ( c == 'n') {
               
               rollAgain = false;
               //System.exit(1);
           }
        
        } while (rollAgain == true);  
    }
}
