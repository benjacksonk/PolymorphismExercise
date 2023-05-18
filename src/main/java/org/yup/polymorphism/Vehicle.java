package org.yup.polymorphism;

import java.time.LocalDate;

public class Vehicle extends Asset {
    String makeModel;
    int year; //the car is this many years old
    int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }


    @Override
    public double getValue() {

        double value = originalCost;

        if (year < 4) {
            value *= 1 - (0.03 * year);
        }
        else if (year < 7) {
            value *= 1 - (0.06 * year);
        }
        else if (year < 11) {
            value *= 1 - (0.08 * year);
        }
        else {
            value -= 1000;
        }

        if ( odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
             value *= 0.75;
        }

        return value;
    }


    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
