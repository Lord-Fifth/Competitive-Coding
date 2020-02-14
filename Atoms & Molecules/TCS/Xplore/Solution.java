/*
Create a Sim Class with following Attributes
int simId;
String customerName;
double balance;
double ratePerSecond; 
String circle;

create a public Class Solution in which take input of 5 object and 
then take 2 input (circle1, circle2) for circle of matches as circle1 and 
choose only those objects which are match with circle1.

Create a method named as transferCircle() and passed sim object and circle1, 
circle2 as parameter and arrange sim object in descending order as per ratePerSecond

Print the output as simId, customerName, circle, ratePerSecond.
*/

import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Sims[] sim = new Sims[5];
        
        for (int i = 0; i < sim.length; i++) {

            int simId = Integer.parseInt(br.readLine());
            String customerName = br.readLine();
            double balance = Double.parseDouble(br.readLine());
            double ratePerSecond = Double.parseDouble(br.readLine());
            String circle = br.readLine();

            sim[i] = new Sims(simId, customerName, balance, ratePerSecond, circle);
        }

        String circle1 = br.readLine();
        String circle2 = br.readLine();

        Sims[] result = transferCircle(sim, circle1, circle2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getSimId() + " " + result[i].getName() + " " + result[i].getCircle() + " " 
            + result[i].getRatePerSecond());
        }
    }

    public static Sims[] transferCircle(Sims[] sim, String circle1, String circle2) {

        Sims temp[];
        int j = 0;

        for(int i = 0; i < sim.length; i++) {
            if(sim[i].getCircle().equals(circle1))
                j++;
        }

        temp = new Sims[j];
        j = 0;

        for(int i = 0; i < sim.length; i++) {
            if(sim[i].getCircle().equals(circle1)) {
                temp[j] = sim[i];
                temp[j++].setCircle(circle2);
            }
        }
        

        //Selection Sort
        for(int i = 0; i < temp.length - 1; i++) {
            int max = i;
            for(int k = i + 1; k < temp.length; k++) {
                if(temp[k].getRatePerSecond() > temp[max].getRatePerSecond())
                    max = k;
            }

            Sims a = temp[i];
            temp[i] = temp [max];
            temp[max] = a;
        }

        return temp;
    }
}

class Sims {

    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sims(int simId, String customerName, double balance, double ratePerSecond, String circle) {

        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }
    public void setSimId(int simId) {
        this.simId = simId;
    }


    public String getName() {
        return customerName;
    }
    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }
    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle) {
        this.circle = circle;
    }
}


/*
Input:

1
raju
130
1.32
mum
2
sachin
120
2.26
ahd
3
ram
200
2.54
kol
4
shubham
640
3.21
ahd
5
kalpesh
150
1.8
ahd
ahd
kol


Output:

4 shubham kol 3.21
2 sachin kol 2.26
5 kalpesh kol 1.8
*/