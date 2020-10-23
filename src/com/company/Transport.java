package com.company;

public abstract class Transport {
    private String model;
    private int year;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
