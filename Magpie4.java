/**
 * Created By
 * Joseph Csoti
 * Aman Thakur
 * Amrit Kehal
**/

import java.util.Scanner;

public class Magpie4
{

    public String getGreeting()
    {
        return "Hey there. What's your name?";
    }

    /**
     * Gives a response to a user statement
     *
     * @param the user statement
     * @return a response based on the rules given
     **/

    public String respondName(String name)
    {
        return "Hello " + name + "!";
    }
    public String getResponse(String statement)
    {
        String response = "";

        if (findKeyword(statement, "!about") == 0) {
            about();
            return "";
        }

        if (findKeyword(statement, "mother") >= 0 || findKeyword(statement, "father") >= 0 || findKeyword(statement, "mom")>= 0 || findKeyword(statement, "dad")>= 0) {
            System.out.println("How are your parents?");
            Scanner sc = new Scanner(System.in);
            String parentState = sc.nextLine();
            if (parentState.equals("bad") || parentState.equals("not well")) {
                return "I'm sorry to hear that.";
            }
        }

        if (findKeyword(statement, "shit") >= 0 || findKeyword(statement, "bitch")>= 0 || findKeyword(statement, "stupid")>= 0) {
            return "You should wash that dirty mouth of yours";
        }

        if (findKeyword(statement, "!math") == 0) {
            return(doMath());
        }

        if (statement.length() == 0)
        {
            response = "Tell me something.";
        }

        else if (findKeyword(statement, "food") >= 0)
        {
            response = "My favorite food is pizza.";
        }

        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }

        else
        {
            // Look for a two word (you <something> me)
            // pattern
            int psn = findKeyword(statement, "you", 0);

            if (psn >= 0
                    && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }

    public void about() {
        Scanner aboutIn = new Scanner(System.in);

        System.out.println("1 - About");
        System.out.println("2 - Creators");
        System.out.println("3 - Change Log");
        System.out.println("4 - Commands");

        int aboutChoice = aboutIn.nextInt();

        if(aboutChoice == 1) {
            System.out.println("About");
            System.out.println("---");
            System.out.println("Magpie is a chat bot that you can talk to");
        }
        if(aboutChoice == 2) {
            System.out.println("Creators");
            System.out.println("---");
            System.out.println("Joseph Csoti");
            System.out.println("Aman Thakur");
            System.out.println("Amrit Kehal");
        }
        if(aboutChoice == 3) {
            System.out.println("Change Log");
            System.out.println("---");
            System.out.println("!about v1.1");
            System.out.println("Math Solver v2.2");
            System.out.println("Swear Word Detector 9000 v3.67");
            System.out.println("Sympathy v1.9");
            System.out.println("Name Responder v0.8");
        }
        if(aboutChoice == 4) {
            System.out.println("Commands");
            System.out.println("---");
            System.out.println("!math - Solves a 2 number math problem for you");
            System.out.println("!about - This thing");
        }

    }

    public String doMath() {

        Scanner mathIn = new Scanner(System.in);

        System.out.println("Choose A Number:");
        System.out.println("1 > Add");
        System.out.println("2 > Subtract");
        System.out.println("3 > Multiply");
        System.out.println("4 > Divide");
        System.out.print("> ");

        int mathChoice = mathIn.nextInt();

        System.out.print("Enter Your First Number: ");
        double math1 = mathIn.nextInt();

        System.out.print("Enter Your Second Number: ");
        double math2 = mathIn.nextInt();

        String mathReply;

        if(mathChoice == 1){
            double total = math1 + math2;
            mathReply = (math1 + " + " + math2 + " = " + total);
            return mathReply;
        }

        if(mathChoice == 2){
            double total = math1 - math2;
            mathReply = (math1 + " - " + math2 + " = " + total);
            return mathReply;
        }

        if(mathChoice == 3){
            double total = math1 * math2;
            mathReply = (math1 + " * " + math2 + " = " + total);
            return mathReply;
        }

        if(mathChoice == 4){
            double total = math1 / math2;
            mathReply = (math1 + " / " + math2 + " = " + total);
            return mathReply;
        }

        else {
            mathReply = "Error: No Choice Selected";
            return mathReply;
        }

        }

    /**
     * Take a statement with "I want to <something>." and transform it into
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "Why do you want to" + restOfStatement + "?";
    }



    /**
     * Take a statement with "you <something> me" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                    .length() - 1);
        }

        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }





    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word
        while (psn >= 0)
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }

            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }



    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }


}


