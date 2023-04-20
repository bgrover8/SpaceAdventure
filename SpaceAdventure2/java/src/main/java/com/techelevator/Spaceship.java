package com.techelevator;

public class Spaceship {

    // This is the spaceship class that will handle things
    // like fuel level, hauling capacity
    // amount of pressure able to withstand
    // heat and cold tolerance
    // the health of the spaceship

    // instance variables
    private int fuelLevel = 50;
    private int resourceLevel = 0;
    private int moneybalance = 0;
    private int resources = 0;

    // room for a constructor if needed

    // methods

    // getters and setters

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public int getFuelLevel() {

        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int addFuel(int fuelInput) {

        return fuelLevel = fuelLevel + fuelInput;
    }

    public int removeFuel (int fuelRemoval){

        return fuelLevel = fuelLevel - fuelRemoval;
    }

    public int getMoneybalance() {
        return moneybalance;
    }

    public void setMoneybalance(int moneybalance) {
        this.moneybalance = moneybalance;
    }





}
