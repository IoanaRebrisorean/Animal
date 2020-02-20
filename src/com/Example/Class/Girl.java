package com.Example.Class;

public class Girl extends Person {

    Girl(){}

    public void rescue(){
        System.out.println(getName() + " rescue");
    }

    public void feed(){
        System.out.println(getName() + " feed");
    }

    public void applyTreatment(){
        System.out.println(getName() + " apply treatment");
    }

    public void buy(){
        System.out.println(getName() + " buy");
    }

    public void askAdvice(){
        System.out.println(getName() + " ask for advice");
    }
}
