package com.Example.Class;

public class Dog extends Animal {

    Dog() {
    }

    public void loves() {
        System.out.println(getName() + " bark");
    }

    public void happy() {
        if (getMood() < 10) {
            System.out.println(getName() + " is sad");
        }
        else{
            System.out.println(getName() + " is happy");
        }
    }



}
