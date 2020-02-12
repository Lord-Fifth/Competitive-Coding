/*
Create a class Movie with Attributes :
movieName String
Company String
Genre String
budget int

Create setters and getters and parametrized Constructor as required
Create another class Solution with a main method and scan attributes as above sequence
ex :
aaa
Marvel
Action
250000000
and scan a search attribute 

Create a Static method getMovieByGenre which will take object array and search string as parameters and returns movies which are matching with genre(Search) having budget less than 80000000 if movie budget is above 8cr print "High Budget Movie" ( Case Senstive Search) else " Low Budget Movie"
*/

import java.io.*;
import java.util.*;

public class Movie {

    public static void getMovieByGenre(M m[], String search) {
        for(int i = 0; i < 4; i++) {
            if(m[i].getGenre().equals(search) && m[i].getBudget() < 80000000)
                System.out.println("Low Budget Movie");
            else if(m[i].getGenre().equals(search) && m[i].getBudget() > 80000000)
                System.out.println("High Budget Movie");
        }
    }

    public static void main(String args[])throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        M m[] = new M[4];
        
        for(int i = 0; i < 4; i++) {
            System.out.println("Enter Movie-name");
            String movieName =br.readLine();
            System.out.println("Enter Company-name");
            String Company =br.readLine();
            System.out.println("Enter Genre");
            String Genre =br.readLine();
            System.out.println("Enter budget");
            int budget = Integer.parseInt(br.readLine());

            m[i] = new M(movieName, Company, Genre, budget);
        } 

        System.out.println("Enter search");
        String search = br.readLine();

        getMovieByGenre(m, search);
    }
}

class M {
    private String movieName;
    private String Company;
    private String Genre;
    private int budget;

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getCompany() {
        return Company;
    }
    public void setCompany(String Company) {
        this.Company = Company;
    }
    public String getGenre() {
        return Genre;
    }
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }

    public M(String movieName, String Company, String Genre, int budget) {
        this.movieName = movieName;
        this.Company = Company;
        this.Genre = Genre;
        this.budget = budget;        
    }
}
