/*
Write a program to print last characters in a string...

Example: 

Input:
Hi tcs

Output:
is
*/

import java.io.*;
import java.lang.*;

public class Last {
    public static void main(String args[])throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.trim();
        str = str + " ";

        char c = ' ';
        for(char ch: str.toCharArray()) {
            if(ch == ' ')
                System.out.print(c);
            c = ch;
        }
        System.out.println();
    }
}

/*
Example 1:
Input: welcome home buddY
Output: eeY


Example 2:
Input: Hi how are you ?
Output: iweu?
*/