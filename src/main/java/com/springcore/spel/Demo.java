package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{3}")
    private int x;

    @Value("#{3+5}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private int z;


    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }




    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
