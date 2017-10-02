package com.company;

public class Boxer extends AbstractSoldier implements InterfaceMelee {
    private double boxerMoves;

    Boxer(String name, String rank) {
       this.name = name;
       this.rank = rank;
       this.ammo = Math.random() * 10;
       boxerMoves = Math.random();
    }

    private double getBoxerMoves() {
        return boxerMoves;
    }

    public String eat() {
        if (this.getBoxerMoves() <= 0) {
            System.out.println(this.name + " the " + this.rank + ": " +"munch, i feel stronger");
            this.ammo += 10;
            return "munch";
        } else {
            return  "not hungry";
        }
    }

    public String sleep() {
        if (this.getBoxerMoves() <= 0.1) {
            System.out.println(this.name + " the " + this.rank + ": " + "Snore");
            this.ammo = 0;
            return "Snore";
        } else {
            return "I'm not tired";
        }
    }

    public String walk() {
        if (this.getBoxerMoves() >= 0.5 && this.getBoxerMoves() < 0.6) {
            System.out.println(this.name + " the " + this.rank + ": " +"Stomp Stomp");
            return "Stomp";
        } else {
            return "I'm not walking anywhere";
        }
    }

    public String speak() {
        System.out.println(this.name + " the " + this.rank + ": " +"Round 2");
        return "Round 2";
    }
    public String soldierPunch() {

            this.ammo  -= 1;
            System.out.println(this.name + " the " + this.rank + ": " + "POW");
            return "POW";
    }
    public String soldierKick() {
            this.ammo  -= 1;
            System.out.println(this.name + " the " + this.rank + ": " + "POP");
            return "Pop";
    }

    public void fight(){
        double whichMove;
        while(this.ammo >= 1){
            this.soldierPunch();

            this.soldierKick();
            }
        }

}