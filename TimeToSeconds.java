import java.util.Scanner;

public class TimeToSeconds {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Time 2 Seconds");
        System.out.println("---");

        System.out.print("Hours: ");
        int hour = input.nextInt();

        System.out.print("Minutes: ");
        int min = input.nextInt();

        System.out.print("Seconds: ");
        int sec = input.nextInt();

        int secTotal = (hour * 3600) + (min * 60) + sec;

        System.out.println("---");
        System.out.println("Total Seconds: " + secTotal);

    }
}
