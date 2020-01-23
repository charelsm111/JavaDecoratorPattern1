package com.charel;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void draw() {
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color: Red");
    }
}
