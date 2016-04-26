import java.util.Scanner;
import java.util.Random;

public class TwentyCards {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rFaceGen = new Random();
        Random rSuitGen = new Random();

        int rFace;
        int rSuit;

        String cardResult;

        System.out.println("20 Cards");
        System.out.println("---");

        System.out.println("Press any key to generate 20 random cards...");

        input.nextLine();

        for (int i = 0; i <= 20; i++) {

            rFace = rFaceGen.nextInt(13) + 1;
            rSuit = rSuitGen.nextInt(4) + 1;

            Card card = new Card(rFace, rSuit);

            cardResult = card.getCardResult();

            System.out.println("Card #" + i + ": " + cardResult);
        }

        System.out.println("\nDone! Created 20 random cards.");

    }

}