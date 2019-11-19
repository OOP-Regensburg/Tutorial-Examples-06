package DiceRollerUI;

import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.graphics.Rectangle;

public class Dice {

    private static final Color DICE_COLOR = Colors.ORANGE;
    private static final int DICE_POINT_RADIUS = 5;
    private static final Color DICE_POINTS_COLOR = Colors.WHITE;

    private Rectangle body;
    private Circle[] points;

    public Dice(int xPosition, int yPosition, int width, int height, int value) {
        body = new Rectangle(xPosition, yPosition, width, height, DICE_COLOR);
        initPoints(value);
    }

    private void initPoints(int value) {
        points = new Circle[value];
        switch (value) {
            case 1:
                points[0] = createPointForDice(body.getXPos() + body.getWidth()/2, body.getYPos() + body.getHeight()/2);
                break;
            case 2:
                points[0] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                points[1] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                break;
            case 3:
                points[0] = createPointForDice(body.getXPos() + body.getWidth()/2, body.getYPos() + body.getHeight()/2);
                points[1] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                points[2] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                break;
            case 4:
                points[0] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                points[1] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                points[2] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                points[3] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                break;
            case 5:
                points[0] = createPointForDice(body.getXPos() + body.getWidth()/2, body.getYPos() + body.getHeight()/2);
                points[1] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                points[2] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                points[3] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                points[4] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                break;
            case 6:
                points[0] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                points[1] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                points[2] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight()/4);
                points[3] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4, body.getYPos() + body.getHeight() - body.getHeight()/4);
                points[4] = createPointForDice(body.getXPos() + body.getWidth()/4, body.getYPos() + body.getHeight()/2);
                points[5] = createPointForDice(body.getXPos() + body.getWidth() - body.getWidth()/4,body.getYPos() + body.getHeight()/2);
                break;
        }
    }

    private Circle createPointForDice(float xPosition, float yPosition) {
        Circle circle = new Circle(xPosition, yPosition, DICE_POINT_RADIUS, DICE_POINTS_COLOR);
        return circle;
    }

    public void draw() {
        body.draw();
        for(int i = 0; i < points.length; i++) {
            points[i].draw();
        }
    }


}
