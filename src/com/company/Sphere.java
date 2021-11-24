package com.company;

public class Sphere {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double area(){
        double areaOfSphere = 4*Math.PI*Math.pow(radius,2);
        System.out.println("Площадь сферы: "+areaOfSphere);
        return areaOfSphere;
    }

    public double volume(){
        double volumeOfSphere = 4/3*Math.PI*Math.pow(radius,3);
        System.out.println("Объем сферы: "+volumeOfSphere);
        return volumeOfSphere;
    }
}

