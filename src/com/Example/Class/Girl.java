package com.Example.Class;

public class Girl extends Person {

    public Girl() {}

    public Girl(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    public void rescue(){
        System.out.println(getName() + " rescue");
    }

    public void feed(Dog dog, DogFood dogFood) {
        System.out.println(getName() + " feeds " + dog.getName() + " with " + dogFood.getName());
        if (dogFood.getQuantity() > 1) {
            dog.setHunger(0);
            dog.setMood(10);
            dog.loves(this);
        } else if (dogFood.getQuantity() == 1) {
            dog.setHunger(5);
            dog.setMood(5);
        } else {
            dog.setHunger(10); // Do NOT fool the dog
            dog.setMood(0);
        }
    }

    public void applyTreatment(Dog dog) {
        System.out.println(getName() + " apply treatment to " + dog.getName());
        dog.setHealth(10);
    }

    public void buy(Food food){
        System.out.println(getName() + " buys food with " + food.getPrice() + " euros");
    }

    public void askAdvice(Vet doctor){
        System.out.println(getName() + " ask for advice from " + doctor.getName());
    }
}
