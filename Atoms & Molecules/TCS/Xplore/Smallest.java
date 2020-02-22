/*
Write main method in Smallest class.
The method will read a String value and print the minimum valued character(as per alphabet and ASCII sequence).
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Smallest {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char min = str.charAt(0);

        for(char ch: str.toCharArray()) {
            if((int) ch < (int) min) {
                min = ch;
            }
        }

        System.out.println(min);
    }
}

/*
Input:
Hello

Output:
H

Important: Answer is not 'e' since 'H' has lower ASCII value than 'e'
*/