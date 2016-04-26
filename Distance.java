import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Distance");
        System.out.println("---");

        System.out.print("X-1: ");
        double x1 = in.nextDouble();

        System.out.print("Y-1: ");
        double y1 = in.nextDouble();

        System.out.println("");

        System.out.print("X-2: ");
        double x2 = in.nextDouble();

        System.out.print("Y-2: ");
        double y2 = in.nextDouble();

        double dist = Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1-y2,2) );

        System.out.println("---");
        System.out.println("Distance: " + dist);
    }
}
