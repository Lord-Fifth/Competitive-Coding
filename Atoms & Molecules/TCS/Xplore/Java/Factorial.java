/*
Write a program to read 5 numbers and print factorials of each.
(Final answers should be non decimal numbers).
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[5];
        int f[] = new int[5];

        for(int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
            f[i] = fact(a[i]);
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(f[i]);
        }

    }    

    public static int fact(int n) {
        if(n == 1) 
            return 1;
        else    
            return (n * fact(n - 1));
    }
}

/*
Input:
2
3
4
6
5

Ouput:
2
6
24
720
120
*/