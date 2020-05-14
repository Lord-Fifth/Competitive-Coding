/*
Take a class name inventory and its 4 object into array and 
implement a method replenish where it will take array objects and 
a limit as a parameter and it will display the id along with fillings 
where filling if greater than 75 it will be critical filling and
if it is between 74 and 50 then moderate filling else non-critical filling
*/

import java.io.*;
import java.util.*;

public class InventorySolution {

    public static void main(String args[])throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Inventory in[] = new Inventory[4];
        
        for(int i = 0; i < in.length; i++) {
            String a = br.readLine();
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            int d = Integer.parseInt(br.readLine());

            in[i] = new Inventory(a, b, c, d);
        }

        int limit = Integer.parseInt(br.readLine());
        Inventory result[] = replenish(in, limit);

        for (int i = 0; i < result.length; i++) {

            if (result[i].getThreshold() >= 75) {
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            }

            else if (result[i].getThreshold() >= 50 && result[i].getThreshold() <= 74) {
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            }
            
            else {
                System.out.println(result[i].getInventoryId() + " Non-Critical Filling");
            }
        }

    }

    public static Inventory[] replenish(Inventory in[], int limit) {
        Inventory temp[];
        int j = 0;

        for(int i = 0; i < in.length; i++) {
            if(in[i].getThreshold() <= limit)
                j++;
        }

        temp = new Inventory[j];
        j = 0;

        for(int i = 0; i < in.length; i++) {
            if(in[i].getThreshold() <= limit)
                temp[j++] = in[i];
        }

        return temp;
    }
}

class Inventory {

    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }
    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }
    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }
     
    public int getCurrentQuantity() {
        return currentQuantity;
    }
    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
    
    public int getThreshold() {
        return threshold;   
    }
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}



/*
Input:
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45
Output:
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
*/