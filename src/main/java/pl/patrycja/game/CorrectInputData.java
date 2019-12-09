package pl.patrycja.game;

public class CorrectInputData {

    public static boolean checkCorrectData(String number) {
        try {
            Integer.parseInt(String.valueOf(number));
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Podano zły argument.");
            return false;
        }
    }
}