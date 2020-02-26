package com.Example.Class;

public class Vet extends Person {

    private String specialization;

    public Vet() {}

    public Vet(String name, int age, int weight, int height, String specialization) {
        super(name, age, weight, height);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void giveAdvice(Person person){
        System.out.println(getName() + " give advice to " + person.getName());
    }

    public void applyTreatment(Animal animal) {
        animal.setHealth(10);
    }
}
