import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Average Calculator");
        System.out.println("---");

        System.out.print("1st Number: ");

        double x = input.nextDouble();

        System.out.print("2nd Number: ");

        double y = input.nextDouble();

        System.out.print("3rd Number: ");

        double z = input.nextDouble();

        double avg = (x + y + z) / 3;

        System.out.print("Average: " + avg);


    }
}
