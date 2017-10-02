package com.company;

public interface InterfaceBomb extends InterfaceMelee {
    public String bomb();

    default public void runAway() {
        System.out.println("RUN AWaaAAAAAaaaAaaY");
    }
}
