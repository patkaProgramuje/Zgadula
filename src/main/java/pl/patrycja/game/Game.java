package pl.patrycja.game;


public class Game {

    private Range range;

    public Game(Range range) {
        this.range = range;
    }

    public void play() {
        BaseNumber randomBaseNumber = range.drawRangeNumber();
        BaseNumber userNumber;
        System.out.println(randomBaseNumber);
        do {
            userNumber = UI.getNumberFromUser();
        } while (!identify(randomBaseNumber, userNumber)); //TODO: check if amount od tries
    }

    //TODO: calculate amount of tries

    private boolean identify(BaseNumber randomDoubleNumber, BaseNumber userDoubleNumber) {

        int compare = randomDoubleNumber.compareTo(userDoubleNumber);

        switch (compare) {
            case -1:
                System.out.println("Number is too high");
                return false;
            case 0:
                System.out.println("Correct! That’s the number");
                return true;
            default:
                System.out.println("Number is too low");
                return false;
        }
    }
}