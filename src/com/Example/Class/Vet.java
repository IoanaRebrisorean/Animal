package com.Example.Class;

public class Vet extends Person {

    Vet(){}

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void giveAdvice(){
        System.out.println(getName() + " give advice");
    }

    public void applyTreatment(){
        System.out.println(getName() + " apply treatment");
    }
}
