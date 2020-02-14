/*
Write a Java program to read a string str and to count both vowels and consonants in that string.

*/

import java.io.*;
import java.lang.*;

public class VowelsConsonants {
    public static void main(String args[])throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int vow = 0, cons = 0;

        for(char ch: str.toCharArray()) {
            if(Character.isLetter(ch)) {
                if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                    vow++;
                else
                    cons++;
            }
        }

        System.out.println("Vowels count - " + vow);
        System.out.println("Consonants count - " + cons);        
    }
}

/*

Input:
Hello World!

Output:
Vowels count - 3
Consonants count - 7
*/