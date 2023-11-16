package com.workintech.model;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player (String name,int healthPercentage, Weapon weapon){
        this.name = name;
        if (healthPercentage>100){
            this.healthPercentage = 100;
        }
        else {
        this.healthPercentage = healthPercentage;

        }
        this.weapon = weapon;
    }
    public int healthRemaining(){
        return this.healthPercentage;
    }

    public int loseHealth(int damage) {
        int remHealth = this.healthPercentage - damage;
        if (remHealth < 0) {
            System.out.println(this.name + " player has been knocked out of game");
        }
        return healthPercentage = remHealth;
    }

    public int restoreHealth(int healthPotion){
        int remHealth = this.healthPercentage + healthPotion;
        if (remHealth > 100) {
            remHealth = 100;
        }
        return healthPercentage = remHealth;
    }

    public String toString (){

        return "name: "+this.name + " health: " + this.healthPercentage + "weapon: "+this.weapon;
    }

}
