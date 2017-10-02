package com.company;

public class Assassin extends AbstractSoldier implements InterfaceAssassin {
    private double deadlySkills;

    Assassin(String name, String rank) {
        this.name = name;
        this.rank = rank;
        this.ammo =  Math.random() * 10;
        deadlySkills = Math.random();
    }

    private double getDeadlySkills() {
        return deadlySkills;
    }

    public String eat() {
        if (this.getDeadlySkills() <= 0) {
            System.out.println(this.name + " the " + this.rank + ": " + "sip");
            this.ammo += 10;
            return "sip";
        } else {
            return  "not hungry";
        }
    }

    public String sleep() {
        if (this.getDeadlySkills() <= 0.1) {
            System.out.println(this.name + " the " + this.rank + ": " + "Too much sleeping draught...");
            return "Snore";
        } else {
            return "I'm not tired";
        }
    }

    public String walk() {
        if (this.getDeadlySkills() >= 0.2 && this.getDeadlySkills() < 0.7) {
            System.out.println(this.name + " the " + this.rank + ": " + "shuffle shuffle");
            return "Stomp";
        } else {
            return "I'm not walking anywhere";
        }
    }

    public String speak() {
        if( this.getDeadlySkills() % 20 == 0)
        System.out.println(this.name + " the " + this.rank + ": " + "shhhhhhhhh... damn it");
        this.ammo = this.ammo - 3;
        return "shhhhhhhhh";
    }

    public String slash() {

            this.ammo -= 1;
            System.out.println(this.name + " the " + this.rank + ": " + "SLAAAAASH");
            return "SLASH";
    }

    public String backstab() {

            this.ammo -= 1;
            System.out.println(this.name + " the " + this.rank + ": " + "stab");
            return "Pop";
    }

    public void fight() {
        if (this.ammo >= 1) {
            this.backstab();
            while (this.ammo >= 1) {
                this.slash();
                }
            }return;
        }
    }


