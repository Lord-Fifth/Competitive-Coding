/*
Create a class Account with the below attributes:
int id
double balance
double interestRate

Class should have getters, setters and constructor with parameters in above sequence of attributes.

Create a class Interest with main method. Read one integer and two double values and create object of Account class. These values 
should be mapped to id, balance and interestRate attributes.

Read one more integer value and store it in variable noOfYears.

Write a method calculateInterest which will take account object and no. of years as input parameters and return the interest amount.

Consider the below logic to calculate the interest values

For specified no of years, first find out the percentage value those no of years based on specified interestRate. eg. if no. of 
years is 5 and specified interestRate is 4% then 4% of 5 is 0.2.
This percentage should be added to original interestRate for calculating the final interest value. Hence for above example it will 
be 4.2(instead of 4).

Display the interest amount rounded upto three decimal places. Even if the result does not have decimal, it should be displayed 
with suffix ".000"
*/

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;

public class Interest {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Account a;

        int id = Integer.parseInt(br.readLine());
        double bal = Double.parseDouble(br.readLine());
        double rate = Double.parseDouble(br.readLine());

        a = new Account(id, bal, rate);

        int noOfYears = Integer.parseInt(br.readLine());
        double interest = calculateInterest(a, noOfYears);

        System.out.println(interest);
    }

    public static double calculateInterest(Account a, int noOfYears) {
        double interest;

        double rate = a.getInterestRate() + (a.getInterestRate()/100 * noOfYears);
        interest = a.getBalance() * (rate/100);

        DecimalFormat df = new DecimalFormat("###.###");

        interest = Double.parseDouble(df.format(interest));

        return interest;
    }
}

class Account {
    private int id;
    private double balance;
    private double interestRate;

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return this.interestRate;
    }
}

/*
Input:

1
1000
10
5

Output:
105.000
*/