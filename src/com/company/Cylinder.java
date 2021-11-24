package com.company;

public class Cylinder {
    private  double PI;
    private int radius;
    private int height;

    public Cylinder(double PI, int radius, int height) {
        this.PI = Math.PI;
        this.radius = radius;
        this.height = height;
    }

    public double area(){
        double areaOfCylinder=2*PI*radius*(height+radius);
        System.out.println("Площадь цилиндра: "+areaOfCylinder);
        return areaOfCylinder;
    }

    public double volume(){
        double volumeOfCylinder=PI*radius*radius*height;
        System.out.println("Объем цилиндра: "+volumeOfCylinder);
        return volumeOfCylinder;
    }
}
