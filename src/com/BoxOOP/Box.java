package com.BoxOOP;

public class Box {
    double width, height, length, vol;

    Box(double w, double l, double h){
        width = w;
        length = l;
        height = h;
    }
    double getVol(){
        vol = width * height * length;
        return vol;
    }
    public void display () {
        System.out.println("the volume is: " + String.format("%.2f", vol));
    }
}
