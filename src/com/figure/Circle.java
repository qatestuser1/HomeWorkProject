package com.figure;

import java.awt.*;

public class Circle extends Shape{
    public int x, y, r;

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}
