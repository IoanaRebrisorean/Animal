package com.Example.Class;

public class Main {

    public static void main(String[] args) {
	 Animal animal = new Animal("Rex", 12, "black", 4, 5, 6);
        System.out.println( animal.getName() + " has " + animal.getAge() +" years, "+ animal.getColor() + " color " + animal.getHealth() + " " + animal.getHunger() + " " + animal.getMood());

      Person person = new Person("Ioana", 24, 50, 160)  ;
        System.out.println(person.getName() + " is " + person.getAge() + " years old and has " + person.getHeight() + " kg, " + person.getWeight() + " height" );

     Food food = new Food("Bobite", 12, 30);
        System.out.println(food.getName());

        DogFood dogFood = new DogFood();


        Dog dog = new Dog();
        dog.setAge(45);
        dog.setColor("white");
        dog.setHealth(44);
        dog.setHunger(10);
        dog.setMood(12);
        dog.setName("Freya");
        dog.loves();
        dog.eat();
        dog.happy();
        dog.isAfraid();
//        dog.set
//        dog.eat("Orice");
        System.out.println(dog.getName() +" is "+ dog.getColor()  );


    }

}
