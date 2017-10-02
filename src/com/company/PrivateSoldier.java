package com.company;

 public class PrivateSoldier extends AbstractSoldier implements InterfaceGun {

     double soldierAction;

    public PrivateSoldier(String name, String rank) {
        this.name = name;
        this.rank = rank;
        this.ammo =  Math.random() * 10;
        System.out.println("ammo" + this.ammo);
        soldierAction = Math.random();
        System.out.println("soldier action points" + soldierAction);
    }

     public double getSoldierAction() {
         return soldierAction;
     }

     public String eat() {
        if (this.getSoldierAction() <= 0.3) {
            System.out.println(this.name + " the " + this.rank + ": " + "munch");
            return "munch";
        } else
            return "not hungry";
        }

    public String sleep() {
        if (this.getSoldierAction() <= 0.1) {
            this.soldierAction = 0;
            this.ammo = 0;
            System.out.println(this.name + " the " + this.rank + ": " + "ZZzzz");
            return "ZZzzz";
        } else {
            return "I'm not tired";
        }
    }

    public String walk() {
        if (this.getSoldierAction() >= 0.5 && this.getSoldierAction() < 0.6) {
            System.out.println(this.name + " the " + this.rank + ": " + "Stomp Stomp");
            return "Stomp";
        } else {
            return "I'm not walking anywhere";
        }
    }

    public String speak() {
        System.out.println(this.name + " the " + this.rank + ": " + "SIR, YES, SIR!!!!");
        return "SIR, YES, SIR!!!!";
    }


    public String shoot() {
        if (this.ammo >= 1) {
            this.ammo -= 1;
            System.out.println(this.name + " the " + this.rank + ": " + "bang");
            }

        return "I'm all out of Ammo";

    }
    public String reload(){
        double reloadChance = Math.random();
        if(this.ammo < 1 && reloadChance > 0.85){
            this.ammo =  Math.random() *10;
            System.out.println(this.name + " the " + this.rank + ": " + "Reloaded");
            return "reloaded";
        }else if(this.ammo < 1){
            System.out.println(this.name + " the " + this.rank + ": " + "i forgot the ammo");
            return "i forgot";
        }
        return "keep going";
    }
    public void fight() {
        while (this.ammo >= 1) {
            this.shoot();
            this.reload();
        }
    }
}

