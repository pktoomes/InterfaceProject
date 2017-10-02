package com.company;

public class Main {
    public static void main(String[] args) {
    PrivateSoldier nick = new PrivateSoldier("Nick", "Private");
    Boxer bill = new Boxer("Bill", "Boxer");
    Witch glenda = new Witch("Glenda", "witch");
    Assassin steve = new Assassin("Steve", "Assassin");
    //move
         steve.walk();
         glenda.walk();
         bill.walk();
         nick.walk();

    //talk
       steve.speak();
       bill.speak();
       glenda.speak();
       nick.speak();
    //assassin attack
        steve.fight();
    //eat
        steve.eat();
        glenda.eat();
        bill.eat();
        nick.eat();
    //sleep
        steve.sleep();
        glenda.sleep();
        bill.sleep();
        nick.sleep();

    //assassin attack
        steve.fight();

    //fight
        glenda.fight();
        nick.fight();
        bill.fight();
    }
}
