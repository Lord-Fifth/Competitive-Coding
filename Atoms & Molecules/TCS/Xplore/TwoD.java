/*
Consider two dimension system with X and Y coordinates.

Write a program to find the distance between two points say X1,Y1 and X2,Y2.
Display the answer rounded to three digits after decimal.
The input will be provided as four numbers separated by space.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class TwoD {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String s[] = str.split(" ");

        int arr[] = new int[s.length];
        for(int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        
        Point p1 = new Point(arr[0], arr[1]);
        Point p2 = new Point(arr[2], arr[3]);

        double distance = findDistance(p1, p2);
        System.out.println(String.format("%.3f", distance));        
    }
    
    public static double findDistance(Point p1, Point p2)
    {   
        double x = Math.pow((p1.getX()-p2.getX()), 2);
        double y = Math.pow((p1.getY()-p2.getY()), 2);

        double distance = Math.sqrt(x+y);

        return distance;        
    }
}

class Point
{   private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return this.y;
    }
}

/*
Eg. 4 4 7 8

Here, X1 will be 4, Y1 will be 4, X2 will be 7 and Y2 will be 8.
Assume that input numbers will not have any decimal values.
The output with these values will be 5.000
*/