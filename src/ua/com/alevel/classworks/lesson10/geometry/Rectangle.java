package ua.com.alevel.classworks.lesson10.geometry;

public class Rectangle extends Shape {
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    private double height;
    private double width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return getWidth()*getHeight();
    }
}
