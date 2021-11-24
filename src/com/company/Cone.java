package com.company;

public class Cone {
    private double PI;
    private int radius;
    private int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
        this.PI=Math.PI;
    }

    public double area(){
        double areaOfCone=PI*Math.pow(radius,2);
        System.out.println("Площадь конуса: "+areaOfCone);
        return areaOfCone;
    }
    public double volume() {
        double volumeOfCone=(height/3)*PI*Math.pow(radius,2);
        System.out.println("Объем конуса: "+volumeOfCone);
        return volumeOfCone;
    }
}
