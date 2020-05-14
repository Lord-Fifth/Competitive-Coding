/*
Class Discount has predefined main method to read values and display the results.
The main method reads the values for five objects of class Shirt.
It also calls methods - getDiscountPrice and getShirtWithMoreThanSpecificPrice defined in same Solution 
class.

Create class Shirt with attributes:
int tag
String brand
double price
char gender

Create constructor which takes parameter in the above sequence. Create getters and setters for these 
attributes.

Next, in Discount class, define two static methods:

public static double getDiscountByPrice(Shirt s):
This method will return the discounted price based on gender for the Shirt object which is passed as input
parameter.
If gender is 'm' then discount is 10%. For 'f' it is 20% and for 'u' it is 30%.

public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts, double price):
This method will take an array of Shirt objects and price value.
The method will return array of Shirt objects with more than specified price in ascending order of price.

Main method reads values for five Shirt objects, followed by price.
Price will be input for method getShirtWithMoreThanSpecificPrice.
*/

import java.util.Scanner;

public class Discount {
    public static void main(String args[] ) throws Exception {

        Shirt[] shirts = new Shirt[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }
        
        double price = sc.nextDouble();
        
        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));            
        }
        
        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        
        for(Shirt s: result)
        {
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }

    public static double getDiscountPrice(Shirt s) {
        if(s.getGender() == 'm') 
            return (0.9*s.getPrice());
        else if(s.getGender() == 'f')
            return (0.8*s.getPrice());
        else if(s.getGender() == 'u')
            return (0.7*s.getPrice());
        else
            return s.getPrice();
    }

    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts, double price) {

        //Selection Sort
        for(int i = 0; i < shirts.length-1; i++) {
            int min = i;
            for(int j = i + 1; j < shirts.length; j++) {
                if(shirts[j].getPrice() < shirts[min].getPrice()) 
                    min = j;
            }

            Shirt s = shirts[min];
            shirts[min] = shirts[i];
            shirts[i] = s;
        }

        int count = 0;
        for(int i = 0; i < shirts.length; i++) {
            if(shirts[i].getPrice() > price)
                count++;
        }
        
        Shirt[] arr = new Shirt[count];
        count = 0;

        for(int i = 0; i < shirts.length; i++) {
            if(shirts[i].getPrice() > price)
                arr[count++] = shirts[i];
        }

        return arr;
    }
}

class Shirt
{
    private int tag;
    private String brand;
    private double price;
    private char gender;

    public Shirt(int tag, String brand, double price, char gender) {
        this.tag = tag;
        this.brand = brand;
        this.price = price;
        this.gender = gender;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
    public int getTag() {
        return this.tag;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return this.gender;
    }
}

/*
Input:
1
arrow
500
m
2
bare
600
f
3
arrow
400
m
4
bare
300
m
5
arrow
1000
u
500

Output:
450.0
480.0
360.0
270.0
700.0
2 600.0 bare
5 1000.0 arrow
*/