package pl.patrycja.game.main;

enum ComparisonResult {
    TooLow("Number is too low"), TooHigh("Number is too high"), Correct("Correct! That’s the number");

    String message;

    ComparisonResult(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
