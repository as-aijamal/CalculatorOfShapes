package com.company;

public class Parallelepiped {
    private int length;
    private int width;
    private int height;

    public Parallelepiped(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int area(){
        int areaOfParallelepiped=2*((height * length) + (length * width) + (height * width));
        System.out.println("Площадь параллелепипеда: "+areaOfParallelepiped);
        return areaOfParallelepiped;
    }

    public int volume(){
        int volumeOfParallelepiped=(length*width*height);
        System.out.println("Объем параллелепипеда: "+volumeOfParallelepiped);
        return volumeOfParallelepiped;
    }
}

