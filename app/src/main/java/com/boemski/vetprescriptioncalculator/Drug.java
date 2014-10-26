package com.boemski.vetprescriptioncalculator;

/**
 * Created by ggvictoria on 10/24/14.
 */
public class Drug {

    // fields
    public String Name;
    public String Category;
    public String AnimalType;
    public Dosage Dosage;

    // constructor
    public Drug(String name, String category, String animalType, Dosage dosage) {
        Name = name;
        Category = category;
        AnimalType = animalType;
        Dosage = dosage;
    }

    // methods
    public void setName(String value) {
        Name = value;
    }

    public void setCategory(String value) {
        Category = value;
    }

    public void setAnimalType(String value) {
        AnimalType = value;
    }

    public void setDosage(Dosage value) {
        Dosage = value;
    }
}
