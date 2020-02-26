package com.Example.Class;

public class HomeActivities {

    private Dog dog;
    private Girl girl;

    public HomeActivities(Girl girl, Dog dog) {
        this.girl = girl;
        this.dog = dog;
    }

    public boolean play() {
        if (dog.getHealth() < 6) {
            return false;
        } else {
            System.out.println(girl.getName() + " plays with " + dog.getName());
            dog.setHunger(10);
            dog.setMood(3);
            return true;
        }
    }

    public void feed() {
        // Determine food quantity based on how hungry the dog is
        int quantity;
        if (dog.getHunger() > 5) {
            quantity = 3;
        } else {
            quantity = 1;
        }
        DogFood food = new DogFood("Pedigree", 20, quantity);
        // The girl buys the food
        girl.buy(food);
        girl.feed(dog, food);
    }
}
