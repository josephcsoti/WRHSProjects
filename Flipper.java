import java.util.Scanner;

public class Flipper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Coin coin = new Coin();

        int key;

        boolean repeat = true;

        //////////////////////////////////////////
        do {

        System.out.println("\nCoin Flipper");
        System.out.println("---");

        System.out.println("1) Lock");
        System.out.println("2) Unlock");
        System.out.println("3) Flip");
        System.out.println("4) Exit");

        int inputChoice = scan.nextInt();

            if (inputChoice == 1) {

                System.out.print("Key: ");
                key = scan.nextInt();

                coin.setKey(key);
                coin.lock(key);

                if (coin.locked() == true) {

                    System.out.println("Coin has been locked");
                }

                if (coin.locked() == false) {

                    System.out.println("Key Incorrect");
                }

            }

            else if (inputChoice == 2) {

                System.out.print("Key: ");
                key = scan.nextInt();

                coin.unlock(key);

                if (coin.locked() == false) {

                    System.out.println("Coin has been unlocked");
                }

                if (coin.locked() == true) {

                    System.out.println("Key Incorrect");
                }

            }

            else if (inputChoice == 3) {

                if (coin.locked() == false) {

                    System.out.print("Number of Flips: ");

                    int numFlips = scan.nextInt();

                    for (int i = 1; i <= numFlips; i++) {

                        coin.flip();
                        System.out.println(coin.toString());
                    }
                }

                if (coin.locked() == true) {

                    System.out.println("Coin is Locked");
                }

            }

            else if (inputChoice == 4) {

                System.exit(1);
            }

        } while (repeat == true);

    }

}
