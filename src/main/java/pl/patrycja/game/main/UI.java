package pl.patrycja.game.main;

import pl.patrycja.game.baseValues.BaseNumber;
import pl.patrycja.game.doubleValues.DoubleNumber;
import pl.patrycja.game.integerValues.IntegerNumber;

import java.util.Scanner;

public class UI {

    public static BaseNumber getNumberFromUser() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        return getNumber(scanner);
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