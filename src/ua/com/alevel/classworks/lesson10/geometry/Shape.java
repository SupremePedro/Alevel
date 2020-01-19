package ua.com.alevel.classworks.lesson10.geometry;

abstract class Shape {
    public abstract double getArea();
    private double getSegment(int x1,int y1,int x2,int y2){
        int deltaX = x2-x1;
        int deltaY = y2 -y1;
        return Math.sqrt(deltaX*deltaY + deltaY*deltaY);
    }

    public final double getUniversalSegment(int [] x1Array, int  [] y1Array, int [] x2Array, int [] y2Array ){
        double segSum = 0;
        for(int i  = 0; i<x1Array.length; i++){
            double segment = getSegment(x1Array[i],y1Array[i],x2Array[i],y2Array[i]);
            segSum+=segment;
        }
        return segSum;
    }
}
