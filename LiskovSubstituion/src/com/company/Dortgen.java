package com.company;

public class Dortgen implements AlaniHesaplanabilir {
     int width;
     int height;
    public Dortgen(int x, int y){
        this.height=y;
        this.width = x;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }
}
