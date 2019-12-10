package pl.patrycja.game;

import pl.patrycja.game.doubleValues.UserDoubleNumber;
import pl.patrycja.game.integerValues.UserIntegerNumber;

import java.util.Scanner;

public class UserBaseNumberFactory {

    //TODO: add others format
    BaseNumber getFormat(Scanner scanner) {
        Number number = changeToNumber(scanner);

        if (number instanceof Double) {
            return new UserDoubleNumber(number.doubleValue());
        } else if (number instanceof Integer) {
            return new UserIntegerNumber(number.intValue());
        }
        return null;
    }

    private Number changeToNumber(Scanner scanner) {
        String input;
        do {
            input = scanner.nextLine();
        } while (CorrectInputData.checkCorrectData(input) == null);
        return CorrectInputData.checkCorrectData(input);
    }
}
