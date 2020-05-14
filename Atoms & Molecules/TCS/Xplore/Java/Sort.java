/*
Create class Book with below attributes:
id - int
title - String
author - String 
price - double

Write getters, setters and parameterized constructor.

Create class Sort with main method.
Implement static method-sortBooksByPrice in Sort class.
This method will take a parameter as array of Book objects.
It will return an array of books which is sorted in the ascending order of book price. Assume that no two books will have the same 
price.
This method should be called from the main method and display values of returned objects as shared in the sample.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sort {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Book b[] = new Book[4];

        for(int i = 0; i < 4; i++) {
            int id = Integer.parseInt(br.readLine());
            String title = br.readLine();
            String author = br.readLine();
            double price = Double.parseDouble(br.readLine());

            b[i] = new Book(id, title, author, price);
        }

        Book sort[] = sortBooksByPrice(b);

        for(int i = 0; i < 4; i++) {
            System.out.println(sort[i].getId() + " " + sort[i].getTitle() + " " + sort[i].getAuthor() + " " + (int)sort[i].getPrice());
        }
        
    }

    public static Book[] sortBooksByPrice(Book b[]) {

        //Selection Sort
        for(int i = 0; i < b.length - 1; i++) {
            int min = i;
            for(int k = i + 1; k < b.length; k++) {
                if(b[k].getPrice() < b[min].getPrice())
                    min = k;
            }

            Book a = b[i];
            b[i] = b[min];
            b[min] = a;
        }

        return b;
    }
}

class Book
{
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
}

/*
Input:
1
hello
writer1
50
2
cup
writer2
55
3
Planet
writer3
45
4
India
writer4
40

Output(each line has values separated by single space):
4 India writer4 40
3 Planet writer3 45
1 hello writer1 50
2 cup writer2 55
*/