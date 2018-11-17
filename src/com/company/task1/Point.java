package com.company.task1;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String ShowPoint() {
        return ("(x,y) is (" + x + "," + y + ")");
    }

    public void addXY(double x, double y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public void addX(double x) {
        this.x = this.x + x;
    }

    public void addY(double y) {
        this.y = this.y + y;
    }

    public double lenght() {
        return (Math.sqrt(this.x * this.x + this.y * this.y));
    }
}
