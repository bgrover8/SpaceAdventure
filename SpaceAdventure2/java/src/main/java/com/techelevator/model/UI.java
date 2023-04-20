package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {

    private Scanner scanner = new Scanner(System.in);
    private List<Locations> locationsListToPrint = new ArrayList<>();
    private int fuelCalled = 0;

    public void firstMessage(){
        System.out.println("CHOOSE YOUR OWN ADVENTURE IN SPACE");
        System.out.println("The year is AfterColony 455.");
        System.out.println("The star system is restless");

    }
    public int startMenu(){
        System.out.println("What do you do?");
        System.out.println("Press (1) to go mine nearby resources to sell");
        System.out.println("Press (2) to travel to another location");
        System.out.println("Press (3) to enter shop");
        System.out.println("Press (7) to check your status");
        System.out.println("Press (9) to quit");

        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }

    public int travelMenu(){
        System.out.println("Where do you want to travel to?");

        for (Locations location: locationsListToPrint){
            String formattedString = String.format("%-4s %-20s %-20s", "(" + location.getId() + ")", location.getAreaName(), "Fuel to travel here " + printFuelNeededMessage(fuelCalled) );
            //travelChart.calculateFuelUsedToDestination(locationId)
            System.out.println(formattedString);
//            location.printLocationInfoList(locationId);
            //    getLocationInfo(location);

        }
        System.out.println("Press (6) to go back to menu");
        System.out.println("Press (7) to travel to check Status");
        System.out.println("Press (9) to quit");

        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }


    public List<Locations> getLocationInfo (List<Locations> locationList){
        locationsListToPrint   = locationList;
        return locationsListToPrint;
        // System.out.println(locations.toString());
    }


    //TODO make a "You are about to quit, are you sure?"

    public void printMessage(String message){
        System.out.println(message);
    }

    public String printFuelNeededMessage(int fuelNeeded){
        int fuelCalled = fuelNeeded;
        String fuelCostToDestination = String.valueOf(fuelNeeded);
        return fuelCostToDestination;
//        System.out.println(message);
    }

    public void printLocationMessage(String locationStatus){
        System.out.println(locationStatus);
    }















}
