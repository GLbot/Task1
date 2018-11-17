package com.company.task1;

public class Line {
    public Point A;
    public Point B;

    public Line(double x1, double y1, double x2, double y2) {
        this.A = new Point(x1, y1);
        this.B = new Point(x2, y2);
    }

    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public String ShowPoints () {
        return ("1st (x,y) is (" + A.x + "," + A.y + ")" + " and 2nd (x,y) is (" + B.x + "," + B.y + ")");
    }

    // вспомогательная функция
    protected boolean P_PointOnLine(Point pA, Point pB, double xp, double yp) {
        boolean isOnLine;
        double xMin, xMax, yMin, yMax;

        // точка лежит на ПРЯМОЙ (не на отрезке)
        // (x-x1)/(x2-x1)=(y-y1)/(y2-y1)
        // или перепишем без дроби
        // (x-x1)*(y2-y1)=(y-y1)*(x2-x1)

        isOnLine = (xp - pA.x) * (pB.y - pA.y) == (yp - pA.y) * (pB.x - pA.x);

        // точка лежит на отрезке
        // (xMin <= x <= xMax) && (yMin <= y <= yMax)
        xMin = (pA.x < pB.x) ? pA.x : pB.x;
        xMax = (pA.x > pB.x) ? pA.x : pB.x;
        yMin = (pA.y < pB.y) ? pA.y : pB.y;
        yMax = (pA.y > pB.y) ? pA.y : pB.y;
        isOnLine = isOnLine && (xMin <= xp) && (xp <= xMax)
                && (yMin <= yp) && (yp <= yMax);
        return isOnLine;
    }

    public boolean PointOnLine(double xp, double yp){
        return P_PointOnLine(A, B, xp, yp);
    }

    public boolean PointOnLine (Point C) {
        return PointOnLine(C.x, C.y);
    }

    public double LineLength() {
        return Math.sqrt( (A.x - B.x)*(A.x - B.x) + (A.y - B.y)*(A.y - B.y));
    }

    // вспомогательная функция
    protected double P_AngleX (Point pA, Point pB) {
        double catetX, catetY, result;
        // ToDo
        // надо разобраться со знаком
        catetX = Math.abs(pA.x - pB.x);
        catetY = Math.abs(pA.y - pB.y);
        result = (catetX == 0.0) ? Math.toDegrees(Math.PI / 2)
                                 : Math.toDegrees(Math.atan(catetY / catetX));
        if (result < 0) result = 180 + result;
        return result;
    }

    public double AngleX () {
        return P_AngleX(A, B);
    }

}
