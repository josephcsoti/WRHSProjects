import java.util.Scanner;

/**
 * Design and implement an application that determines and prints
 * the number of odd, even, and zero digits in an integer
 * read from the keyboard.
 */
public class OddEvenZero {

    public static void main(String[] args){

        int wholeNum;
        int singleNum;

        int even = 0;
        int odd = 0;
        int zero = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Even / Odd / Zero");
        System.out.println("---");

        System.out.print("Enter a number: ");
        wholeNum = input.nextInt();

        int ogWholeNum = wholeNum;

        while (wholeNum > 0 ) {

            singleNum = wholeNum % 10;

            //Zero
            if (singleNum == 0){
                zero++;
            }

            //Even
            if (singleNum % 2 == 0){
                even++;
            }

            //Odd
            if (singleNum % 2 != 0){
                odd++;
            }

            wholeNum = wholeNum / 10;
        }

        System.out.println("");
        System.out.println("Number: " + ogWholeNum);
        System.out.println("Even: " + even);
        System.out.println("Odd:  " + odd);
        System.out.println("Zero: " + zero);

    }

}
