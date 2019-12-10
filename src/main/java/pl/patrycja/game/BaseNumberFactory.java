package pl.patrycja.game;

import pl.patrycja.game.doubleValues.UserDoubleNumber;
import pl.patrycja.game.integerValues.UserIntegerNumber;

import java.util.Optional;

import static pl.patrycja.game.Format.DOUBLE;
import static pl.patrycja.game.Format.INTEGER;

public class BaseNumberFactory {

    //TODO: add others format
    Optional<BaseNumber> create(String number) {
        if (DOUBLE.matches(number)) {
            return Optional.of(new UserDoubleNumber(Double.parseDouble(number)));
        } else if (INTEGER.matches(number)) {
            return Optional.of(new UserIntegerNumber(Integer.parseInt(number)));
        } else {
            return Optional.empty();
        }
    }
}
