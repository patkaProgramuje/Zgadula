package pl.patrycja.game;

import java.text.NumberFormat;
import java.text.ParseException;

public class CorrectInputData {

    public static Number checkCorrectData(String number) {
        try {
            return NumberFormat.getInstance().parse(number);
        } catch (ParseException e) {
            System.out.println("Niewłaściwy format danych. Podaj liczbę.");
            return null;
        }
    }
}