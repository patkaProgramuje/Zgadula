package pl.patrycja.game;

import java.util.Scanner;

public class UI {

/*    public static UserDoubleNumber getNumberFromUser() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        while (!CorrectInputData.checkCorrectData(number)) {
            number = scanner.next();
        }
        return new UserDoubleNumber(Integer.parseInt(String.valueOf(number)));
    }*/

    public static BaseNumber getNumberFromUser() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        UserBaseNumberFactory userBaseNumberFactory = new UserBaseNumberFactory();
        return userBaseNumberFactory.getFormat(scanner);
    }
}