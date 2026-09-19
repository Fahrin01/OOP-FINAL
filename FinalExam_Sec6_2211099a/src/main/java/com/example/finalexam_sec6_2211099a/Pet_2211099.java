package com.example.finalexam_sec6_2211099a;

import java.io.Serializable;
import java.time.LocalDate;

public class Pet_2211099 implements Serializable {
    private int petId;
    private String name, species, adoptionStatus;
    private LocalDate dateOfBirth;

    public Pet_2211099(int petId, String name, String species, String adoptionStatus, LocalDate dateOfBirth) {
        this.petId = petId;
        this.name = name;
        this.species = species;
        this.adoptionStatus = adoptionStatus;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(String adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Pet_2211099{" +
                "petId=" + petId +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", adoptionStatus='" + adoptionStatus + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
