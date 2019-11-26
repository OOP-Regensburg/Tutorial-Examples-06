package DiceRollerUI;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

/**
 * Vorlesungsbeispiel
 * <p>
 * GraphicsApp-Anwendung, die das Würfeln mit n Würfeln graphisch simuliert.
 */

public class DiceDemo extends GraphicsApp {

    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 200;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;
    private static final int DICE_WIDTH = SCREEN_WIDTH/10;
    private static final int DICE_HEIGHT = DICE_WIDTH;
    private static final int NUMBER_OF_DICE = 6;
    private static final int MAX_DICE_VALUE = 6;
    private static final int DICE_X_START_POS = DICE_WIDTH/2;
    private static final int DICE_Y_START_POS = (SCREEN_HEIGHT - DICE_HEIGHT)/2;

    @Override
    public void initialize() {
        setFrameRate(1);
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        Dice[] dice = createRandomDice(NUMBER_OF_DICE);
        for(int i = 0; i < dice.length; i++) {
            dice[i].draw();
        }
    }

    private Dice[] createRandomDice(int numberOfDice) {
        Dice[] dice = new Dice[numberOfDice];
        for(int i = 0; i < dice.length; i++) {
            int x = DICE_X_START_POS + i * (DICE_WIDTH + DICE_WIDTH/2);
            int y = DICE_Y_START_POS;
            int randomValue = getRandomDiceValue();
            dice[i] = new Dice(x,y,DICE_WIDTH, DICE_HEIGHT, randomValue);
        }
        return dice;
    }

    private int getRandomDiceValue() {
        int value = (int) ((Math.random() * MAX_DICE_VALUE) + 1);
        return value;
    }

}
