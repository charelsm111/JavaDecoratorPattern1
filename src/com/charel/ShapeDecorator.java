package com.charel;

public abstract class ShapeDecorator implements Shape {

    protected Shape decorateShape;

    public ShapeDecorator(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }

    public void draw() {
        decorateShape.draw();
    }
}
