package com.in28minutes.oops.level2;

import java.awt.*;

public class RectanglerRunner {
    public static void main(String[] args) {
        Rectangler rectangler = new Rectangler(12, 13);
        System.out.println(rectangler);
        rectangler.setWidth(25);
        System.out.println(rectangler);
    }
}
