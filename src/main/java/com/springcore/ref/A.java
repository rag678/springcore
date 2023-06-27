package com.springcore.ref;

public class A {
    private Integer x;
    private B obj;

    public A() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }
}
