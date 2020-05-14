/*
Create class Document with below attributes:
id - int
title - String
folderName - String 
pages - int

Write getters, setters and parameterized constructor.

Create class Library with main method.
Implement static method-docsWithOddPages in Library class.
This method will take a parameter as array of Document objects and return another array with Document objects which has odd number
of pages.
This method should be called from the main method and display values of returned objects as shared in the sample(in ascending order 
of id attribute).
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Library {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Document d[] = new Document[4];

        for(int i = 0; i < 4; i++) {
            int id = Integer.parseInt(br.readLine());
            String title = br.readLine();
            String folder = br.readLine();
            int pages = Integer.parseInt(br.readLine());

            d[i] = new Document(id, title, folder, pages);
        }

        ArrayList<Document> odd = docsWithOddPages(d);

        for(int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i).getId() + " " + odd.get(i).getTitle() + " " + odd.get(i).getFolderName() + " " + odd.get(i).getPages());
        }
        
    }

    public static ArrayList<Document> docsWithOddPages(Document d[]) {

        //Selection Sort
        for(int i = 0; i < d.length - 1; i++) {
            int min = i;
            for(int k = i + 1; k < d.length; k++) {
                if(d[k].getId() < d[min].getId())
                    min = k;
            }

            Document a = d[i];
            d[i] = d[min];
            d[min] = a;
        }

        ArrayList<Document> odd = new ArrayList<Document>();

        for(int i = 0; i < 4; i++) {
            if(d[i].getPages() % 2 != 0) {
                odd.add(d[i]);
            }
        }

        return odd;
    }
}

class Document
{
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
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

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages() {
        return this.pages;
    }
}

/*
Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40

Output(each line has values separated by single space):
3 question1 exams 55
2 question2 exams 45
*/