/**
 * Created By
 * Joseph Csoti
 * Aman Thakur
 * Amrit Kehal
 **/

import java.util.Scanner;

public class MagpieRunner4
{

    public static void main(String[] args)
    {
        Magpie4 maggie = new Magpie4();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        System.out.println(maggie.respondName(name));
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}