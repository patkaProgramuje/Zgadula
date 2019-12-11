package pl.patrycja.game;

import java.util.Optional;
import java.util.Scanner;

public class UI {

    public static BaseNumber getNumberFromUser() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        BaseNumberFactory baseNumberFactory = new BaseNumberFactory();
        Optional<BaseNumber> optionalBaseNumber = baseNumberFactory.create(scanner.next());
        while (optionalBaseNumber.isEmpty()) {
            System.out.println("Unknown format. Please reenter.");
            String input = scanner.next();
            optionalBaseNumber = baseNumberFactory.create(input);
        }
        return optionalBaseNumber.get();
    }
}