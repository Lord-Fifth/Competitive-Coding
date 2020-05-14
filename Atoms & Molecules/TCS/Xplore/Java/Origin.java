/*
Write a program to check distance of 2D points from origin and print the point with highest distance.

Create a class Point with attributes as below:
double x
double y

In Origin class, define main method to read values for three point objects.

Next, create below method in Origin class which will take three point objects as input parameters and
return the point with highest distance from origin.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Origin {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        double x1 = Double.parseDouble(br.readLine());
        double y1 = Double.parseDouble(br.readLine());
        double x2 = Double.parseDouble(br.readLine());
        double y2 = Double.parseDouble(br.readLine());
        double x3 = Double.parseDouble(br.readLine());
        double y3 = Double.parseDouble(br.readLine());

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        
        Point p = pointWithHighestOriginDistance(p1, p2, p3);

        System.out.println(p.getX());
        System.out.println(p.getY());
    }

    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3) {

        double x1 = Math.pow((p1.getX()-0), 2);
        double y1 = Math.pow((p1.getY()-0), 2);

        double distance1 = Math.sqrt(x1+y1);

        double x2 = Math.pow((p2.getX()-0), 2);
        double y2 = Math.pow((p2.getY()-0), 2);

        double distance2 = Math.sqrt(x2+y2);

        double x3 = Math.pow((p3.getX()-0), 2);
        double y3 = Math.pow((p3.getY()-0), 2);

        double distance3 = Math.sqrt(x3+y3);

        if(distance1 > distance2 && distance1 > distance3)
            return p1;
        else if(distance2 > distance1 && distance2 > distance3)
            return p2;
        else
            return p3;
    }
}

class Point
{   private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return this.y;
    }
    
}

/*
Input: 
2
2
3
3
-4
-4

Ouput:
-4.0
-4.0
*/