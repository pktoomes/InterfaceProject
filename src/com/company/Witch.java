package com.company;

public class Witch extends AbstractSoldier implements InterfaceMagic {
    private double witchCraft;

    Witch(String name, String rank) {
        this.name = name;
        this.rank = rank;
        this.ammo = Math.random() * 10;
        System.out.println("witch ammo " + this.ammo);
        witchCraft = Math.random();
    }

    private double getWitchCraft() {
        return witchCraft;
    }

    public String eat() {
        if (this.getWitchCraft() <= 0) {
            System.out.println(this.name + " the " + this.rank + ": " + "CRUNCH");

            return "CRUNCH";
        } else {
            return  "not hungry";
        }
    }

    public String sleep() {
        if (this.getWitchCraft() <= 0.2) {
            System.out.println(this.name + " the " + this.rank + ": " + "Too much sleeping draught...");
            this.ammo = 0;
            return "Snore";
        } else {
            return "I'm not tired";
        }
    }

    public String walk() {
        if (this.getWitchCraft() >= 0.5 && this.getWitchCraft() < 0.6) {
            System.out.println(this.name + " the " + this.rank + ": " + "swoosh");
            return "Stomp";
        } else {
            return "I'm not walking anywhere";
        }
    }

    public String speak() {
        System.out.println(this.name + " the " + this.rank + ": " + "CACKLE");
        return "Round 2";
    }

    public String summonFamiliar() {
        if (this.ammo >= 4 && this.ammo < 5) {
            this.ammo -= 1;
            Familiar muffin = new Familiar("muffin", "cat");
            System.out.println(this.name + " the " + this.rank + ": " + "Poof");
            muffin.speak();
            muffin.eat();
            muffin.sleep();
            muffin.walk();
            muffin.fight();
            this.speak();
        }
        return "no familiar";
    }

    public String hex() {
        if(this.ammo >= 1) {
            this.ammo -= 1;
            System.out.println(this.name + " the " + this.rank + ": " + "Curse YOU!");
        }
        return "no more hex";
        }


    public void fight() {
        while (this.ammo >= 1) {
            this.hex();
            this.summonFamiliar();

            }
        }

}

