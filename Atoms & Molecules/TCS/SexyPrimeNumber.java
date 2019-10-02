//Java program to find the no. of sexy prime pairs in a range
//A Sexy-prime pair is a pair of prime numbers whose difference is 6

import java.io.*;
import java.lang.*;
import java.util.*;

public class SexyPrimeNumber {

    boolean prime(int num) {
        int sq = (int) Math.round(Math.sqrt(num));      //Checking uptil Square-root of the number
        if(num==1)              //1 is not prime
            return false;
        for(int i=2;i<=sq;i++) {
            if(num%i == 0) 
                return false;
        }
        return true;
    }
    
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String range = br.readLine();           //Taking range as String and then splitting it as String array
        String w[] = range.split("\\s");
        
        int m = Integer.parseInt(w[0]);
        int n = Integer.parseInt(w[1]);

        SexyPrimeNumber s = new SexyPrimeNumber();
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=m;i<=n;i++) {
            boolean flag = s.prime(i);          //Prime check
            if(flag) {
                list.add(i);
            }
        }

        // for (Integer j : list) 
        //     System.out.print(j + " "); 

        int count = 0;
        for(int i=0;i<list.size();i++) {
            int n1 = list.get(i);           //Taking each prime number and checking if an equalent sexy prime pair exists
            int n2 = n1+6;                  

            for(int j=i+1;j<list.size();j++) {
                if(n2 == list.get(j))
                    count++;
            }
        }

        System.out.println("Number of Sexy pairs : " + count);
    }
}