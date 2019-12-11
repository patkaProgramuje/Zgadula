package pl.patrycja.game.main;

import pl.patrycja.game.baseValues.BaseNumber;
import pl.patrycja.game.doubleValues.DoubleNumber;
import pl.patrycja.game.integerValues.IntegerNumber;

import java.util.Scanner;

class NumberSource {

    static BaseNumber getNumberFromUser() {
        System.out.print("Enter number: ");
        return getNumber(new Scanner(System.in));
    }

    private static BaseNumber getNumber(Scanner scanner){
        if (scanner.hasNextDouble()) {
            return new DoubleNumber(scanner.nextDouble());
        } else if (scanner.hasNextInt()) {
            return new IntegerNumber(scanner.nextInt());
        }
        return null;
        //TODO: add other format
    }
}