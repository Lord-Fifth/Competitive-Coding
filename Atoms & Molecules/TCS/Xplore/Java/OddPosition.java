/*
To print characters at odd position of a string


input: Matrix
output : Mti
*/

import java.io.*;
import java.util.*;

public class OddPosition {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            if(i % 2 == 0)
                System.out.print(str.charAt(i));
        }
    }
}

/*
Output:


Example 1:
Matrix
Mti
Example 2:
Hi how are you?
H o r o?
*/