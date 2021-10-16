package edu.northeastern.yanxuan;

public class Square extends Shape{
    int side;

    public Square(int side){
        super("","");
        this.side=side;
    }

    public Square(String name, String color, int side){
        super(name,color);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        this.area=side*side;
        return area;
    }

    public int getPerimeter() {
        this.perimeter=4*side;
        return perimeter;
    }

    public String printShape(){
        return "The Square has a "+this.color+" color";
    }
}//end of class Square
