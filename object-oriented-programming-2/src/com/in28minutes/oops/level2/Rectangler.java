package com.in28minutes.oops.level2;

public class Rectangler {
    //state
    private int lenghth;
    private int width;
    //creation
    public Rectangler(int lenghth, int width) {
        this.lenghth = lenghth;
        this.width = width;
    }

    //operations

    public int getLenghth() {
        return lenghth;
    }

    public void setLenghth(int lenghth) {
        this.lenghth = lenghth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public  int area(){
        return lenghth * width;
    }

    public int perimeter(){
        return 2 * (lenghth + width);
    }

    public  String toString(){
        return String.format("length - %d width - %d area _ %d perimeter - %d", lenghth, width, area(), perimeter());
    }
}
