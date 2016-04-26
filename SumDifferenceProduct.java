import java.util.Scanner;

public class SumDifferenceProduct {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("SDP Calculator");
        System.out.println("---");

        System.out.print("1st Number: ");

        Double x = input.nextDouble();

        System.out.print("2nd Number: ");

        Double y = input.nextDouble();

        System.out.println("---");

        double sum = x + y;
        double diff = x - y;
        double prod = x * y;

        System.out.println("Sum: " + sum);
        System.out.println("Diffrence: " + diff);
        System.out.println("Product: " + prod);
    }

}
