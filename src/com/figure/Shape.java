package com.figure;

import java.util.Objects;

public abstract class Shape {
    public String colour;
    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(colour, shape.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour);
    }
}
