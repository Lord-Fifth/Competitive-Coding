/*
 In main method read an integer (containing only numeric digits without decimal and special characters) and check whether the given number is perfect square or not. 
 If it is print TRUE (as string) else print FALSE(as string )
*/

import java.io.*;

public class PerfectSquare {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());

        boolean flag = false;

        for(int i = 1; i <= n/2; i++) {
            if(i*i == n) {
                flag = true;
                break;
            }
        }

        if(flag || n == 1) 
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}