/*
Create class Player with below attributes:
playerId - int
skill - String
level - String 
points - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.
Implement two static method -
findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

findPointsForGivenSkill method:
This method will take two input parameters - array of Player objects and string parameter skill.
The method will return the sum of the points attribute from player objects for the skill passed as parameter. If no player with the given skill is present in the array of player objects, then the method should return 0.

getPlayerBasedOnLevel method:
This method will take two String parameters level and skill, along with the array of Player objects.
The method will return the player object, if the input String parameters matches with the level and skill attribute of the player object and its point attribute is greater than or equal to 20. If any of the conditions are not met, then the method should return null.

Note: No two player object would have the same value for skill and level attribute.
    All player object would have the points greater than 0.
    All the searches should be case insensitive.

These above menthioned static methods should be called from the main method.
For findPointsForGivenSkill method - The main method should print the points as it is if the returned price is greater than 0 or it should print "The given Skill is not availabale."
For getPlayerBasedOnLevel method - The main method should print the playerId of the return player object. If the returned value is null then it should print "No player is available with specified level, skill and eligibility points."

Before calling these static methods in main, use Scanner object to read values of four Player objects referring attributes in the above mentioned attribute sequence.
Next, read the value for skill and level. Please consider the skill value read above as skill parameter for both the static methods.
*/

import java.io.*;
import java.util.*;

public class Player {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        P players[] = new P[4];
        
        for(int i = 0; i < players.length; i++) {
            int id = Integer.parseInt(br.readLine());
            String skill = br.readLine();
            String level = br.readLine();
            int points = Integer.parseInt(br.readLine());

            players[i] = new P(id, skill, level, points);
        } 
        //System.out.println("Find total points for a particular skill.");
        String reqskill = br.readLine();
        int totalPoints = findPointsForGivenSkill(players, reqskill);

        //System.out.println("Find player based on skill and level.");
        String reqlevel = br.readLine();
        P finalPlayer = getPlayerBasedOnLevel(players, reqskill, reqlevel);

        if(totalPoints > 0)
            System.out.println(totalPoints);
        else 
            System.out.println("The given Skill is not availabale.");

        if(finalPlayer != null)
            System.out.println(finalPlayer.getPlayerId());
        else 
            System.out.println("No player is available with specified level, skill and eligibility points.");
    }   

    public static int findPointsForGivenSkill(P[] players, String skill) {

        int sum = 0;
        for(int i = 0; i < players.length; i++) {
            if(players[i].getSkill().equalsIgnoreCase(skill))
                sum += players[i].getPoints();
        }

        return sum;
    }

    public static P getPlayerBasedOnLevel(P[] players, String skill, String level) {

        P player = null;
        for(int i = 0; i < players.length; i++) {
            if(players[i].getSkill().equalsIgnoreCase(skill) && players[i].getLevel().equalsIgnoreCase(level) && players[i].getPoints() >= 20)
                player = players[i];
        }

        return player;
    }
}

class P {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public P(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public int getPlayerId() {
        return this.playerId;        
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public String getSkill() {
        return this.skill;        
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getLevel() {
        return this.level;        
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getPoints() {
        return this.points;        
    }
}

/*
Input:
101
cricket
Basic
20
102
cricket
Intermediate
25
111
football
Intermediate
50
113
baseball
Advanced
100
cricket
Intermediate

Output:
45
102
*/