package com.Example.Class;

public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public void loves(Person girl) {
        System.out.println(getName() + " barks of joy because of " + girl.getName());
    }

    public void happy() {
        if (getMood() < 10) {
            System.out.println(getName() + " is sad");
        }
        else {
            System.out.println(getName() + " is happy");
        }
    }



}
