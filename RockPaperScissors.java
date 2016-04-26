import java.util.Random;
import java.util.Scanner;

/**
 * Design and implement an application that plays rock-paper-scissors against the computer.
 * The program should randomly choose an option and then ask for the user's selection.
 * The program then reveals both choices and displays the result.
 * Keep playing until the user chooses to stop then print the number of user wins, losses, and ties.
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        boolean quit = false;

        int win = 0;
        int tie = 0;
        int lose = 0;

        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Rock Paper Scissors");
        System.out.println("---");

        while(quit == false) {

            int rnum = rand.nextInt(3)+1; // 1=rock 2=paper 3=scissors

            System.out.println("Rock? Paper? Or Scissors?");

            char rps = input.next().charAt(0);

            // User = Rock
            if(rps == 'r') {

                // C = Rock
                if(rnum == 1) {
                    System.out.println("Rock vs. Rock... Tie");
                    tie++;
                }

                // C = Paper
                if(rnum == 2) {
                    System.out.println("Rock vs. Paper... Lose");
                    lose++;
                }

                // C = Scissors
                if(rnum == 3) {
                    System.out.println("Rock vs. Scissors... Win");
                    win++;
                }

            }

            // User = Paper
            if(rps == 'p') {

                // C = Rock
                if(rnum == 1) {
                    System.out.println("Paper vs. Rock... Win");
                    win++;
                }

                // C = Paper
                if(rnum == 2) {
                    System.out.println("Paper vs. Paper... Tie");
                    tie++;
                }

                // C = Scissors
                if(rnum == 3) {
                    System.out.println("Paper vs. Scissors... Lose");
                    win++;
                }

            }

            // User = Scissors
            if(rps == 's') {

                // C = Rock
                if(rnum == 1) {
                    System.out.println("Scissors vs. Rock... Lose");
                    lose++;
                }

                // C = Paper
                if(rnum == 2) {
                    System.out.println("Scissors vs. Paper... Win");
                    win++;
                }

                // C = Scissors
                if(rnum == 3) {
                    System.out.println("Scissors vs. Scissors... Tie");
                    tie++;
                }

            }

            if(rps == 'e') {
                quit = true;
            }

        }

        if (quit == true) {
            System.out.println("");
            System.out.println("Stats");
            System.out.println("---");
            System.out.println("Wins:  " + win);
            System.out.println("Loses: " + lose);
            System.out.println("Ties:  " + tie);
        }
    }
}
