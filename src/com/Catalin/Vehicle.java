package com.Catalin;

public class Vehicle {
    private int framework;
    private int body;
    private int fuelTank;
    private int engine;
    private String name;

    public Vehicle(int fuelTank, int engine, String name) {
        this.framework = 1;
        this.body = 1;
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.name = name;
    }
}
