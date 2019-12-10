package pl.patrycja.game;

import java.util.Scanner;

public class UI {

    public static BaseNumber getNumberFromUser() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        UserBaseNumberFactory userBaseNumberFactory = new UserBaseNumberFactory();
        return userBaseNumberFactory.getFormat(scanner);
    }
}