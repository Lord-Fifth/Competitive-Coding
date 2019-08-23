//Java program to find the no. of unique numbers in a range

import java.io.*;
import java.lang.*;

public class UniqueDigitNumber { 

    int unique(int arr[], int n) 
    {   
        int[] c = new int[10];        //Create an array to store the frequency of digits of each number during each iteration
        boolean flag;
        int count = 0;

        for(int i = 0; i < 10; i++) {   //Digit array to zero
            c[i] = 0;
        }
        
        for(int i = 0; i < n; i++) {    //Extract digits and update frequency
            int num = arr[i];
            flag = true;

            while(num>0) {
                int d = num%10;
                num=num/10;
                c[d]++;
            }

            for(int j = 0; j < 10; j++) {
                if(!(c[j]==0 || c[j]==1)) {     //Check if each digit occurs either once or never at all
                    flag = false;
                    break;
                }
            }

            for(int j = 0; j < 10; j++) {
                c[j] = 0;
            }

            if(flag)                            //Update count according to flag
                count++;
        }
        return count;
    } 
  
    public static void main(String[] args)throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String range = br.readLine();       //Get the range of numbers in string
        String s[] = range.split("\\s");    //Split the range with split()

        int m = Integer.parseInt(s[0]);     //Type-cast the range to Integer
        int n = Integer.parseInt(s[1]);

        int arr_size = n-m+1;
        int arr[] = new int[arr_size];

        int j = 0;
        for(int i = m; i <= n; i++) {
            arr[j] = i;
            j++;
        }

        UniqueDigitNumber uq = new UniqueDigitNumber(); 
        System.out.println("Number of unique numbers are " + uq.unique(arr, arr_size)); 
    } 
} 