import java.text.NumberFormat;
import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Currency X-Change");
        System.out.println("---");
        System.out.println("Enter the Amount");

        System.out.print("Quarters: ");
        int qNum = in.nextInt();

        System.out.print("Dimes: ");
        int dNum = in.nextInt();

        System.out.print("Nickels: ");
        int nNum = in.nextInt();

        System.out.print("Pennies: ");
        int pNum = in.nextInt();

        int total = ( (qNum * 25) + (dNum * 10) + (nNum * 5) + (pNum * 1) ) / 100;

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        System.out.println("---");
        System.out.println("Total: " + defaultFormat.format(total));



    }
}
