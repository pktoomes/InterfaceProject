package com.company;

public class Main {
    public static void main(String[] args) {
    PrivateSoldier nick = new PrivateSoldier("Nick", "Private");
    Boxer bill = new Boxer("Bill", "Boxer");
    Witch glenda = new Witch("Glenda", "witch");
    Assassin steve = new Assassin("Steve", "Assassin");
    Mutant carl = new Mutant ( "Carl", "Mutant");
    //move
         steve.walk();
         glenda.walk();
         bill.walk();
         nick.walk();
         carl.walk();

    //talk
       steve.speak();
       bill.speak();
       glenda.speak();
       nick.speak();
       carl.speak();

    //eat
        steve.eat();
        glenda.eat();
        bill.eat();
        nick.eat();
        carl.eat();
    //sleep
        steve.sleep();
        glenda.sleep();
        bill.sleep();
        nick.sleep();
        carl.sleep();

    //assassin attack
        steve.fight();

    //fight
        glenda.fight();
        nick.fight();
        bill.fight();
        carl.fight();
        carl.bomb();


        carl.runAway();
    }


}
