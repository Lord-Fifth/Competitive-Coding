/*
Write a Program to print smallest vowel in the given line…(Ascii Values)
 */

import java.io.*;
import java.lang.*;

public class SmallestVowel {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for(char ch: str.toCharArray()) {
            if(ch == 'a' || ch == 'A')
                a++;
            else if(ch == 'e' || ch == 'E')
                e++;
            else if(ch == 'i' || ch == 'I')
                i++;
            else if(ch == 'o' || ch == 'O')
                o++;
            else if(ch == 'u' || ch == 'U')
                u++;
        }

        if(a > 0)
            System.out.println("a");
        else if(e > 0)
            System.out.println("e");
        else if(i > 0)
            System.out.println("i");
        else if(o > 0)
            System.out.println("o");
        else if(u > 0)
            System.out.println("u");
        else 
            System.out.println("No vowels");

    }
}

 /*
input:
matrix

output:
a
 */