package com.company.task1;

public class Main {
    public static void main(String[] args) {

        Point A1 = new Point (0,0);
        Point B1 = new Point (9,0);
        Point C1 = new Point (0,9);
        Point D1 = new Point( 0, 4);
        Point D2 = new Point( 4, 0);

        Curve Cu1 = new Curve(A1, B1, C1);

        System.out.println("Cu1");
        System.out.println( Cu1.ShowPoints() );
        System.out.println( Cu1.PointOnLine(D1) + " " + Cu1.PointOnLine(D2));
        System.out.println( Cu1.Angle() );

        Line L1 = new Line(A1, B1);
        Line L2 = new Line(B1, C1);

        System.out.println( L1.AngleX() );
        System.out.println( L2.AngleX() );

        Point A2 = new Point (0,1);
        Point B2 = new Point (9,10);
        Point C2 = new Point (10,9);

        Curve Cu2 = new Curve(A2, B2, C2);
        Line L3 = new Line(A2, B2);
        Line L4 = new Line(B2, C2);

        System.out.println( "L3 angle = " + L3.AngleX() );
        System.out.println( "L4 angle = " + L4.AngleX() );

        System.out.println( "Cu2" );
        System.out.println( Cu2.ShowPoints() );
        System.out.println( Cu2.PointOnLine(3, 4));
        System.out.println( Cu2.Angle() );


    }
}
