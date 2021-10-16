package edu.northeastern.yanxuan;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int side){
        super("","");
        this.width=side;
        this.height=side;
    }

    public Rectangle(int width, int height){
        super("","");
        this.width=width;
        this.height=height;
    }

    public Rectangle(String name, String color,int width, int height){
        super(name,color);
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        this.area=width*height;
        return area;
    }

    public int getPerimeter() {
        this.perimeter=2*(width+height);
        return perimeter;
    }

    public String printShape(){
        return "The Rectangle has a "+this.color+" color";
    }
}//end of class Rectangle
