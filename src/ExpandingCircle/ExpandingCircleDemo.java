package ExpandingCircle;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

/**
 * Vorlesungsbeispiel
 * <p>
 * GraphicsApp-Anwendung, die zwei Kreise darstellt, die sich - animiert über den draw loop - schrittweise ausdehnen.
 * Die Kreise werden als Instanzen einer eigenen Klasse (ExpandingCircle) dargestellt.
 */

public class ExpandingCircleDemo extends GraphicsApp {

    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;

    ExpandingCircle[] circles;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        initCircles();
    }

    private void initCircles() {
        circles = new ExpandingCircle[2];
        circles[0] = new ExpandingCircle(150, 150, 50, Colors.BLUE);
        circles[1] = new ExpandingCircle(450, 450, 50, Colors.RED);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        drawCircles();
    }

    private void drawCircles() {
        for (int i = 0; i < circles.length; i++) {
            circles[i].update();
            circles[i].draw();
        }
    }
}
