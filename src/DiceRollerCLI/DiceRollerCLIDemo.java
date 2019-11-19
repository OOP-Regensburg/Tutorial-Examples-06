package DiceRollerCLI;

import java.util.Random;
import java.util.Scanner;

/**
 * Vorlesungsbeispiel
 * <p>
 * Eine einfache Konsolenanwendung, die zufälliges Würfeln simuliert. Auf Basis der Eingabe
 * des Nutzenden (Anzahl der Würfel) wird simuliert, wie wieviele Würfe für das Erreichen des
 * maximalen Punktewerts notwendig sind.
 */

public class DiceRollerCLIDemo {

    /**
     * Wertebereich der zu verwendenen Würfel
     */
    private static final int MIN_DICE_VALUE = 1;
    private static final int MAX_DICE_VALUE = 6;

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfDice = readInt("Mit wie vielen Würfeln soll ich würfeln? ");
        int maxResult = numberOfDice * MAX_DICE_VALUE;
        int result = 0;
        int numberOfTries = 0;
        while (result != maxResult) {
            result = 0;
            for (int i = 0; i < numberOfDice; i++) {
                int randomDiceValue = MIN_DICE_VALUE + random.nextInt(MAX_DICE_VALUE);
                result += randomDiceValue;
            }
            numberOfTries++;
        }
        System.out.println("Das maximale Ergebnis (" + maxResult + ") wurde nach " + numberOfTries + " Versuchen erreicht!");
    }

    /**
     * Gibt eine Nachricht an den Nutzenden aus und liefert dessen Antwort als Ganzzahlwert zurück.
     */
    private static int readInt(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
