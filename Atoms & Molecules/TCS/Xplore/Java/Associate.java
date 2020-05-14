/*
Create solution class Implement Static method "associates forGivenTechnology" in solution class.
This method will take a string parameter as array of associate objects.


The method will return array of Associates where string parameter appears in technology
attribute(with case insensitive search) and experienceInyears should be multiple of 5.


Create class Associate with below attributes:
associate id- string
associate name- string
Technology- string
experienceInYears-int


Write getters,setters and parameterized constructor.
Create class solution with the main method.
Implement Static method - associateForgiventechnology in solution class.
This method will take a string parameter named technology along with the other parameter as array of objects.
The method will return array of associate where the string parameter appears in the technology attribute (with case insensitive search) and the experienceInyears should be multiples of 5.
This method should be called from main method and display the id of returned objects in ascending order.


Before calling this method (associateForgiventechnology) in the main method use scanner object to read values for five associate objects referring the attributes in above sequence then read value for search parameter.
Next call the method associateForgiventechnology,write the logic to print the ID's (in main method) And display result.
*/

import java.io.*;
import java.util.*;

public class Associate {

    public static void main(String args[]) {

        int id ,exp;
        String name,tech;
        As[] ass = new As[5];
        Scanner sc=new Scanner(System.in);
        for(int i = 0;i<5;i++) {
            System.out.println("id = ");
            id = sc.nextInt();
            System.out.println("name = ");
            name = sc.next();
            System.out.println("tech = ");
            tech = sc.next();
            System.out.println("exp = ");
            exp = sc.nextInt();
            ass[i] = new As(id, name, tech, exp);
        }       
        String techa;
        System.out.println("Enter tech = ");
        techa = sc.next();
        ArrayList<As> Os = getTech(ass,techa);
        for(int i=0;i<Os.size();i++)
            System.out.println(Os.get(i).getId()+" "+Os.get(i).getName()+" "+Os.get(i).getTech()+" "+Os.get(i).getExp());
    }

    public static ArrayList<As> getTech(As[] d, String th) {
        ArrayList<As> bs = new ArrayList<As>();
        for(int i=0;i<d.length;i++) {
            if(d[i].getTech().equals(th) && d[i].getExp()%5==0)
            bs.add(d[i]);
            }
        return bs;
        }
}

class As{
    private int id;
    private String name;
    private String tech;
    private int exp;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }

    public As(int id, String name, String tech, int exp) {
    this.id = id;
    this.name = name;
    this.tech = tech;
    this.exp = exp;
    }
}

/*
Input


Alex
101
Ja a
15
Albert
102
Unix
20
Alferd
103
Testing
13
Alfa
104
Java
15
Almas
105
Java
29


Output

101
104
*/