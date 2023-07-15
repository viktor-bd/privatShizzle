package dk.getShredded;

import dk.getShredded.model.SetRepetitionRange;

import java.time.Period;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        var Set = new Set("Set", SetRepetitionRange.tenToTwelve(), new Period(0, 0, 0, 0, 0, 0, 0, 0));
    }
}