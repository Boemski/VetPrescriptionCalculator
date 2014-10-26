package com.boemski.vetprescriptioncalculator;

/**
 * Created by ggvictoria on 10/24/14.
 */
public class Dosage {

    // fields
    public boolean AnimalWeightRangeFlag;
    public float DrugAmount;
    public String UnitOfMeasurement;
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
        DrugAmount = value;
    }

    public void setUnitOfMeasurement (String value) {
        UnitOfMeasurement = value;
    }

    public void setAnimalWeightRangeMinimum (float value) {
        AnimalWeightRangeMinimum = value;
    }

    public void setAnimalWeightRangeMaximum (float value) {
        AnimalWeightRangeMaximum = value;
    }
}