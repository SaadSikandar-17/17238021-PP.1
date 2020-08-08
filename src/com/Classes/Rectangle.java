package com.Classes;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width=0.0;
        height=0.0;
    }

    public  Rectangle(double width, double height) {
        this.height=height;
        this.width=width;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.height=height;
        this.width=width;
    }
    public double getWidth() {
        return width;

    }
    public void setWidth(double width) {
        this.width=width;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    public double getArea() {
        return width*height;
    }

    public  double getPerimeter() {
        return (height*2)+(width*2);
    }

}
