import java.util.Scanner;

public class SecondsToTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Seconds 2 Time");
        System.out.println("---");

        System.out.print("Seconds: ");
        int sec = input.nextInt();

        System.out.println("---");

        int hour = sec / 3600;
        int min = sec % 3660;
        int secs = sec / 3660;

        System.out.print(hour + " Hours, " + min + " Minutes, " + secs + " Seconds");
    }
}
