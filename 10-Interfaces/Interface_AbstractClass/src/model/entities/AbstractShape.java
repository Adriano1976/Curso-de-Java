package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements IShape {

    private Color color;

    protected AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
