package edu.northeastern.yanxuan;

public class Shape {
    String name;
    String color;
    int area;
    int perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public String printShape(){
        return "The "+ this.name + " has a "+this.color+" color";
    }
}//end of class Shape
