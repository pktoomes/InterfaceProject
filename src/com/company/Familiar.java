package com.company;

public class Familiar extends AbstractSoldier implements InterfaceFamiliar {
    private double catPoints;

    Familiar(String name, String rank) {
        this.name = name;
        this.rank = rank;
        this.ammo =  Math.random() * 10;
        catPoints = Math.random();
    }

    private double getCatPoints() {
        return catPoints;
    }

    public String eat() {
        if (this.getCatPoints() <= .14) {
            System.out.println(this.name + " the " + this.rank + ": " + "nibble");
            this.ammo += 10;
            return  "nibble";
        } else {
            return  "not hungry";
        }
    }

    public String sleep() {
        if (this.getCatPoints() <= 0.1) {
            System.out.println(this.name + " the " + this.rank + ": " + "Prrr Prrr");
            return "Snore";
        } else {
            return "I'm not tired";
        }
    }

    public String walk() {
        if (this.getCatPoints() >= 0.55 && this.getCatPoints() < 0.6) {
            System.out.println(this.name + " the " + this.rank + ": " + "Tap Tap Tap Tap");
            return "Stomp";
        } else {
            return "I'm not walking anywhere";
        }
    }

    public String speak() {
        System.out.println(this.name + " the " + this.rank + ": " + "i'm here to serve");
        return "Round 2";
    }

    public String scratch() {
            if(this.ammo >=1) {
                this.ammo -= 1;
                System.out.println(this.name + " the " + this.rank + ": " + "hiss");
            }
            return"no scratch";
    }

    public String selfcare() {
        if(this.ammo >= 1) {
            this.ammo -= 1;
            System.out.println(this.name + " the " + this.rank + ": " + "MEOW");
        }
            return "meow";
    }

    public void fight() {
        while (this.ammo >= 1) {

            if (this.ammo >= 6 && this.ammo < 7) {
                this.selfcare();
            } else {
                this.scratch();
            }
        }
        if (this.ammo <= 1) {
            System.out.println(this.name + " the " + this.rank + ": " + "I have to go now");
        }
    }
}

