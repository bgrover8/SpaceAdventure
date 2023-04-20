package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Locations {


    private Map<Integer, Locations> locationMap = new HashMap<>();
    private String areaName;
    private int id;
    private int fuelNeededToGetHere;
    private TravelChart travelChart;



    public Locations(int id, String areaName) {
        this.id = id;
        this.areaName = areaName;
        this.fuelNeededToGetHere = 50;
    }
    public Locations(){

    }

    public int getId() {
        return id;
    }

    public int getFuelNeededToGetHere() {
        return fuelNeededToGetHere;
    }

    public void setFuelNeededToGetHere( int locationId) {
        int distanceFuelUsed = 50 * (locationId - id);
        if (distanceFuelUsed < 0){
            distanceFuelUsed = distanceFuelUsed * -1;
        }
        this.fuelNeededToGetHere = distanceFuelUsed;
    }

    public String getAreaName() {
        return areaName;
    }
    // returns the location name based on the
    // location ID picked


    // make a list to print for the menu to use

    public String printLocationInfoList(int locationId) {
        String formattedString = String.format("%-4s %-20s %-20s", "(" + this.id + ")", this.areaName, "Fuel to travel here " + this.fuelNeededToGetHere);
        return formattedString;
    }











}
