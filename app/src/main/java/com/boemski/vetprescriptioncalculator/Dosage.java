package com.boemski.vetprescriptioncalculator;

/**
 * Created by ggvictoria on 10/24/14.
 */
public class Dosage {

    // fields
    public boolean AnimalWeightRangeFlag;
    public float DrugAmount;
    public String UnitOfMeasurement;

    // weight range must be in kilograms
    // TODO: Make sure the classes saving this data use a rule that converts from pounds to kilograms.
    public float AnimalWeightRangeMinimum;
    public float AnimalWeightRangeMaximum;

    // constructor
    public Dosage(boolean animalWeightRangeFlag, float drugAmount, String unitOfMeasure, float animalWeightRangeMinimum, float animalWeightRangeMaximum) {

        AnimalWeightRangeFlag = animalWeightRangeFlag;
        DrugAmount = drugAmount;
        UnitOfMeasurement = unitOfMeasure;
        AnimalWeightRangeMinimum = animalWeightRangeMinimum;
        AnimalWeightRangeMaximum = animalWeightRangeMaximum;

    }

    // methods
    public void setAnimalWeightRangeFlag (boolean value) {
        AnimalWeightRangeFlag = value;
    }

    public void setDrugAmount (float value) {
        // If the value is less than or equal to 0, return an exception.
        if (value <= 0) {
            throw new IllegalArgumentException("Drug amount must be greater than 0.");
        }
        DrugAmount = value;
    }

    public void setUnitOfMeasurement (String value) {
        // If the value is null or an empty string or it contains a blank space, return an exception.
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Drug amount requires a unit of measurement specified or selected.");
        }
        UnitOfMeasurement = value;
    }

    public void setAnimalWeightRangeMinimum (float value) {

        // If the animal weight range flag is turned on, do minimum animal weight validation.
        if (AnimalWeightRangeFlag) {
            // The minimum animal weight must be greater than 0.
            if (value > 0) {
                AnimalWeightRangeMinimum = value;
            }
            else {
                throw new IllegalArgumentException("If AnimalWeightRangeFlag is True, Animal weight range minimum must be greater than 0.");
            }
        }
        // If the animal weight range flag is turned on, do minimum animal weight validation.
        else {
            // The minimum animal weight must be 0.
            if (value == 0) {
                AnimalWeightRangeMinimum = value;
            }
            else {
                throw new IllegalArgumentException("Animal weight range minimum cannot be set if AnimalWeightRangeFlag is false.");
            }
        }
    }

    // TODO: Raven will complete this method using the setAnimalWeightRangeMinimum method as a template.
    public void setAnimalWeightRangeMaximum (float value) {
        AnimalWeightRangeMaximum = value;
    }
}