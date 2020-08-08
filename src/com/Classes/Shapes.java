package com.Classes;

public class Shapes {
    private double width;
    private double height;

    public Shapes() {
        width=0.0;
        height=0.0;
    }

    public Shapes(double width, double height) {
        this.height=height;
        this.width=width;
    }

    public Shapes(double width, double height, String color, boolean filled) {
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
