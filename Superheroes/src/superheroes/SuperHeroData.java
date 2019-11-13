/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superheroes;

import java.util.ArrayList;

/**
 *
 * @author shaznimhussain
 */
public class SuperHeroData {
 private String title;
 private String realName; 
 private int height;
 private int intelligence; 
 private int strength;
 private int speed;
 private int agility;
 private int fightingSkills;
 private String backStory;
 
 
 SuperHeroData(String title, String realName, int height, int intelligence, int strength, int speed, int agility, int fightingSkills, String backStory){
     
 this.title = title;
 this.realName = realName;
 this.height = height;
 this.intelligence = intelligence;
 this.strength = strength;
 this.speed = speed;
 this.agility = agility;
 this.fightingSkills = fightingSkills;
 this.backStory = backStory;    
 
 }
 
 public void printCard(){
System.out.println("-----------------------------------");
     System.out.println("title" + title);
     System.out.println("realName" + realName);
     System.out.println("height" + height);
     System.out.println("intelligence" + intelligence);
     System.out.println("strength" + strength);
     System.out.println("speed" + speed);
     System.out.println("agility" + agility);
     System.out.println("fightingSkills" + fightingSkills);
     System.out.println("backStory" + backStory);
     System.out.println("------------------------------------");
     
   
 }
    public String getTitle() {
        return title;
    }

    public String getRealName() {
        return realName;
    }

    public int getHeight() {
        return height;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAgility() {
        return agility;
    }

    public int getFightingSkills() {
        return fightingSkills;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setFightingSkills(int fightingSkills) {
        this.fightingSkills = fightingSkills;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }
        
}

