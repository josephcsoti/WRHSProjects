public class PairOfDice {

    private int dieOneResult;
    private int dieTwoResult;

    Die dieOne;
    Die dieTwo;

    public PairOfDice() {

        dieOne = new Die();
        dieTwo = new Die();
    }

    public void rollDice() {

        dieOneResult = dieOne.roll();
        dieTwoResult = dieTwo.roll();
    }

    public int getDieOneResult() {

        return dieOneResult;
    }

    public int getDieTwoResult() {

        return dieTwoResult;
    }

}