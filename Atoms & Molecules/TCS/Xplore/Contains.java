/*
Create class Books with below attributes:
id - int
title - String
author - String 
price - double

Write getters, setters and parameterized constructor.
Create class Contains with main method.

Implement static method-searchTitle in Contains class.

This method will take a parameter of String value along with other parameter as array of Books objects.
It will return an array of books where String value parameter appears in the title attribute(with case insensitive search).
This method should be called from the main method and display id of returned objects in ascending order.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class Contains {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Books b[] = new Books[4];

        for(int i = 0; i < 4; i++) {
            int id = Integer.parseInt(br.readLine());
            String title = br.readLine();
            String author = br.readLine();
            double price = Double.parseDouble(br.readLine());

            b[i] = new Books(id, title, author, price);
        }

        String search = br.readLine();

        Books result[] = searchTitle(b, search);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].getId());
        }
        
    }

    public static Books[] searchTitle(Books b[], String search) {

        //Selection Sort
        for(int i = 0; i < b.length - 1; i++) {
            int min = i;
            for(int k = i + 1; k < b.length; k++) {
                if(b[k].getId() < b[min].getId())
                    min = k;
            }

            Books a = b[i];
            b[i] = b[min];
            b[min] = a;
        }

        int count = 0;

        for(int i = 0; i < b.length; i++) {
            if(b[i].getTitle().toLowerCase().contains(search.toLowerCase()))
                count++;
        }

        Books find[] = new Books[count];
        count = 0;

        for(int i = 0; i < b.length; i++) {
            if(b[i].getTitle().toLowerCase().contains(search.toLowerCase()))
                find[count++] = b[i];
        }

        return find;
    }
}

class Books
{
    private int id;
    private String title;
    private String author;
    private double price;

    public Books(int id, String title, String author, double price) {
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
hello world
aaa writer
50
2
World cup
bbb writer
55
3
Planet earth
ccc writer
45
4
India's history
ddd writer
40
WORLD

Output:
1
2
*/