/*
Write a Program to Print no.of Spaces and Characters in a given input


input: Hello This is ABCD from XYZ city
output : No of Spaces : 6 and characters : 26 
*/

import java.io.*;
import java.util.*;

public class SpaceCharacter {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter input");

        int sp = 0, ch = 0;
        String str = br.readLine();
        for(char c: str.toCharArray()) {
            if(c == ' ')
                sp++;
            else 
                ch++;
        }

        System.out.println("No of Spaces : " + sp + " and characters : " + ch);
    }
}