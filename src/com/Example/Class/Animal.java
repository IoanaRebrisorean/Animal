package com.Example.Class;

public class Animal {

    private String name;
    private int age;
    private String color;
    private int health;
    private int hunger;
    private int mood;

    Animal() {
    }

    Animal(String name, int age, String color, int health, int hunger, int mood) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.health = health;
        this.hunger = hunger;
        this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void eat() {
        System.out.println(getName() + " eat...");
    }

    public void loves(Person person) {
        System.out.println(getName() + " loves" + person.getName());
    }

    public void isAfraid() {
        System.out.println(getName() + " is afraid");
    }
}
