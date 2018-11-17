package com.company.task1;

public class Curve extends Line {
    public Point C;

    public Curve (Point A, Point B, Point C) {
        super (A, B);
        this.C = C;
    }

    public double Angle () {
    // ToDo
        // не во всех случаях работает корректно - надо разобраться
        return (180 - P_AngleX(A, B) - P_AngleX(B, C));
    }

    @Override
    public String ShowPoints() {
        return ("1st (x,y) is (" + A.x + "," + A.y + ")"
              + " and 2nd (x,y) is (" + B.x + "," + B.y + ")"
              + " and 3rd (x,y) is (" + C.x + "," + C.y + ")"
               );
    }

    @Override
    public boolean PointOnLine(double xp, double yp) {
        return P_PointOnLine(A, B, xp, yp) || P_PointOnLine(B, C, xp, yp);
    }

    @Override
    public boolean PointOnLine(Point D) {
        return P_PointOnLine(A, B, D.x, D.y) || P_PointOnLine(B, C, D.x, D.y);
    }

}
