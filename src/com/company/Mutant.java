package com.company;

public class Mutant extends AbstractSoldier implements InterfaceBomb {

    double mutantPoints;

    Mutant(String name, String rank) {
        this.name = name;
        this.rank = rank;
        this.ammo = Math.random() * 10;
        mutantPoints = Math.random();

    }

    public double getMutantPoints() {
        return mutantPoints;
    }

    public String eat() {
        if (this.getMutantPoints() <= 0.5) {
            System.out.println(this.name + " the " + this.rank + ": " + "sip");
            this.ammo += 10;
            return "sip";
        } else {
            return  "not hungry";
        }
    }


    public String sleep() {
        if (this.getMutantPoints() <= 0.1) {
            System.out.println(this.name + " the " + this.rank + ": " + "time to rest my eye....");
            return "Snore";
        } else {
            return "I'm not tired";
        }
    }


    public String walk() {
        if (this.getMutantPoints() >= 0.5 && this.getMutantPoints() < 0.6) {
            System.out.println(this.name + " the " + this.rank + ": " +"Draaaaaaaaag");
            return "Stomp";
        } else {
            return "I'm not walking anywhere";
        }
    }


    public String speak() {
        System.out.println(this.name + " the " + this.rank + ": " +"My genes don't fit right");
        return "Round 2";
    }

    public void fight() {
        while(this.ammo >= 1){
            this.soldierPunch();

            this.soldierKick();
        }
    }



    public String bomb() {
        System.out.println(Integer.toString( 12));;
        return "bomb";
    }



    public String soldierPunch() {
        this.ammo  -= 1;
        System.out.println(this.name + " the " + this.rank + ": " + "POW");
        return "POW";
    }


    public String soldierKick() {
        this.ammo  -= 1;
        System.out.println(this.name + " the " + this.rank + ": " + "PlOP");
        return "Pop";
    }

    @Override
    public void runAway() {

    }
}
