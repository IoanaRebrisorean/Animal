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


    public void eat(DogFood dogFood) {
        if( dogFood.getFoodType().equals("Bobite")){
            System.out.println("Mananca bobite");
        }
        else{
            System.out.println("Mananca orice");
        }
    }
}
