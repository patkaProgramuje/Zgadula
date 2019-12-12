package pl.patrycja.game.main;

enum ComparisonResult {
    TooLow(-1), TooHigh(1), Correct(0);

    private final int result;

    ComparisonResult(int result) {
        this.result = result;
    }

    static ComparisonResult of(int result) {
        if (result < 0) return TooLow;
        if (result > 0) return TooHigh;
        return Correct;
    }

    String message() {
        switch (of(result)) {
            case TooLow:
                return "Number is too low";
            case TooHigh:
                return "Number is too high";
            default:
                return "Correct! That’s the number";
            }
    }
}
