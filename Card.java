public class Card {

    String suit;
    String face;
    String returnString;

    public Card(){

        suit = "Heart";
        face = "Ace";
    }

    public Card(int x, int y){

        face = rFaceToString(x);
        suit = rSuitToString(y);
    }

    public String getSuitValue() {

        return suit;
    }

    public String getFaceValue() {

        return face;
    }

    public String getCardResult() {

        returnString = face + " of " + suit;
        return returnString;
    }


    // Define int to actual string

    public String rFaceToString(int x) {

        switch(x) {

            case 1: face = "Ace"; break;
            case 2: face = "2"; break;
            case 3: face = "3"; break;
            case 4: face = "4"; break;
            case 5: face = "5"; break;
            case 6: face = "6"; break;
            case 7: face = "7"; break;
            case 8: face = "8"; break;
            case 9: face = "9"; break;
            case 10: face = "10"; break;
            case 11: face = "Jack"; break;
            case 12: face = "Queen"; break;
            case 13: face = "King"; break;

            default: face = "Something Went Wrong - face";

        }

        return face;
    }

    public String rSuitToString(int y) {

        switch(y) {

            case 1: suit = "Clubs"; break;
            case 2: suit = "Diamonds"; break;
            case 3: suit = "Hearts"; break;
            case 4: suit = "Spades"; break;

            default: suit = "Something Went Wrong - suit";
        }

        return suit;
    }

}