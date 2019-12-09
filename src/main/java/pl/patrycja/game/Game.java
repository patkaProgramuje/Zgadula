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
                System.out.println("Your number is to high.");
                return false;
            case 0:
                System.out.println("Winner");
                return true;
            default:
                System.out.println("to small");
                return false;
        }
    }
}