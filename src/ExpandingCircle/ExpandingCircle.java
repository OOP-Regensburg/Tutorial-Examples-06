package ExpandingCircle;

import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.graphics.Circle;

public class ExpandingCircle {

    private static final int MAX_RADIUS = 100;
    private static final int GROW_RATE = 1;
    private Circle circle;

    public ExpandingCircle(int xPosition, int yPosition, int radius, Color color) {
        int initalRadius = radius;
        if(initalRadius > MAX_RADIUS) {
            initalRadius = MAX_RADIUS;
        }
        circle = new Circle(xPosition, yPosition, initalRadius, color);
    }

    public void update() {
        if(circle.getRadius() >= MAX_RADIUS) {
            return;
        }
        int newRadius = (int) circle.getRadius() + GROW_RATE;
        circle.setRadius(newRadius);
    }

    public void draw() {
        circle.draw();
    }

}
