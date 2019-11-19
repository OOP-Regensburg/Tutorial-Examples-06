package NumberedBallons;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

/**
 * GraphicsApp-Anwendung, die mehrere Ballons simuliert, die vom unteren Bildschirmrand nach oben aufsteigen.
 */

public class NumberedBallonsDemo extends GraphicsApp {

    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 800;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
    }
}
