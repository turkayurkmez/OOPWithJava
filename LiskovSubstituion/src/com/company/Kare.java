package com.company;

public class Kare implements AlaniHesaplanabilir  {
    private int width;
    public void setWidth(int width){
        this.width = width;

    }
    public int getWidth(){
        return this.width;
    }

    public int getArea(){
        return width * width;
    }

    public Kare(int width){
        this.width = width;
    }


}
