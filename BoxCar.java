import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BoxCar {

    public static void main(String[] args) throws InterruptedException {

        int ROLLS = 1000;
        int boxCarCount = 0;
        int diceOneValue;
        int diceTwoValue;
        double percent;

        PairOfDice pair = new PairOfDice();

        Scanner input = new Scanner(System.in);

        System.out.println("Box Car");
        System.out.println("---");
        System.out.println("Press any key to play...");

        String key = input.nextLine();


        //Secret Mode. Entering "//" will show the results of each roll
        if (key.equals("//")) {

            for (int j = 0; j <= ROLLS; j++) {

                pair.rollDice();

                diceOneValue = pair.getDieOneResult();
                diceTwoValue = pair.getDieTwoResult();

                if (diceOneValue == 6 && diceTwoValue == 6) {

                    boxCarCount++;

                    TimeUnit.MILLISECONDS.sleep(15);
                    System.out.print("\rRoll #" + j + ": True");
                }

                else {

                    TimeUnit.MILLISECONDS.sleep(15);
                    System.out.print("\rRoll #" + j + ": False");
                }
            }

            percent = (boxCarCount / 1000.0 ) * 100;

            System.out.println("\nBox Car: " + boxCarCount + "/" + ROLLS + " OR " + percent + "%");
        }

        else {

            for (int i = 0; i <= ROLLS; i++) {

                pair.rollDice();

                diceOneValue = pair.getDieOneResult();
                diceTwoValue = pair.getDieTwoResult();

                if (diceOneValue == 6 && diceTwoValue == 6) {

                    boxCarCount++;
                }
            }

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

            percent = (boxCarCount / 1000.0 ) * 100;

            System.out.println("Box Car: " + boxCarCount + "/" + ROLLS + " OR " + percent + "%");
        }
    }

}