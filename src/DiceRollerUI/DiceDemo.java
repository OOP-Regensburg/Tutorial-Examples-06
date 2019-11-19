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


    @Override
    public void initialize() {
        setFrameRate(1);
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
    }

}
