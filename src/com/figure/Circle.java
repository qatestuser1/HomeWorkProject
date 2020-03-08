package com.figure;

import java.awt.*;
import java.util.Objects;

public class Circle extends Shape{
    public int x, y, r;

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y &&
                r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, r);
    }
}
