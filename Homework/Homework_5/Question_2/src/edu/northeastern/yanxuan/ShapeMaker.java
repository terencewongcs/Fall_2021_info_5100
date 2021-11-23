package edu.northeastern.yanxuan;

public class ShapeMaker implements Shape {
    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    @Override
    public void draw() {

    }

    void drawCircle() {
        circle.draw();
    }

    void drawRectangle() {
        rectangle.draw();
    }

    void drawSquare() {
        square.draw();
    }
}
