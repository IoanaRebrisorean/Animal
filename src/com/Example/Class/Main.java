package com.Example.Class;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Rex", 12, "black", 4, 5, 6);
//        System.out.println( animal.getName() + " has " + animal.getAge() +" years, "+ animal.getColor() + " color " + animal.getHealth() + " " + animal.getHunger() + " " + animal.getMood());
//
//        Person person = new Person("Ioana", 24, 50, 160)  ;
//        System.out.println(person.getName() + " is " + person.getAge() + " years old and has " + person.getHeight() + " kg, " + person.getWeight() + " height" );
//
//        Food food = new Food("Bobite", 12, 30);
//        System.out.println(food.getName());

        Dog dog = new Dog();
        dog.setAge(4);
        dog.setColor("white");
        dog.setHealth(10);
        dog.setHunger(10);
        dog.setMood(1);
        dog.setName("Freya");

        Girl girl = new Girl("Ioana", 5, 30, 1);

        // The girl wants to play with the dog
        HomeActivities activities = new HomeActivities(girl, dog);
        if (activities.play()) {
            // The dog is healthy enough to play, but now it is hungry
            activities.feed();
        } else {
            // The dog is too sick to play. Go to the doctor
            Vet doctor = new Vet("Mitrut", 25, 80, 2, "Dogolog");
            // Create an instance of a private clinic of this doctor
            PrivateClinic clinic = new PrivateClinic(doctor);
            // The girl takes the dog to the clinic to check on its health
            clinic.appointment(girl, dog);
        }
    }

}
