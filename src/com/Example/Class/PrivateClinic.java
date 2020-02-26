package com.Example.Class;

public class PrivateClinic {

    // The doctor who owns the clinic.
    private Vet doctor;

    public PrivateClinic(Vet vet) {
        doctor = vet;
    }

    // Describes a situation where a girl comes to the clinic with her dog to get help from the doctor.
    public void appointment(Girl girl, Dog dog) {
        if (dog.getHealth() < 6) {
            girl.askAdvice(doctor);
            doctor.giveAdvice(girl);
            doctor.applyTreatment(dog);
        }
    }
}
