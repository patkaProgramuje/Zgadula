package pl.patrycja.game;

import pl.patrycja.game.doubleValues.UserDoubleNumber;
import pl.patrycja.game.integerValues.UserIntegerNumber;

import java.util.Scanner;

public class UserBaseNumberFactory {

    BaseNumber getFormat(Scanner scanner){
        if (scanner.hasNextDouble()) {
            return new UserDoubleNumber(Double.parseDouble(String.valueOf(scanner.nextDouble())));
        } else if (scanner.hasNextInt()) {
            return new UserIntegerNumber(Integer.parseInt(String.valueOf(scanner.nextDouble())));
        }
        return null;
        //TODO: add other format
    }
}
