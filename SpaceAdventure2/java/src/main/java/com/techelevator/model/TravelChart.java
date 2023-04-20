package com.techelevator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelChart {

    private Map<Integer, Locations> locationMap = new HashMap<>();
    private Locations locations = new Locations();

    public Map<Integer, Locations> mapOfLocations(int locationId) {
        String firstArea = "Mining Colony 321";
        String secondArea = "Mining Colony 257";
        String thirdArea = "Mars Colony 78";
        String fourthArea = "Moon Colony 56";
        String fifthArea = "Earth Colony 23";
        Locations miningColony321  = new Locations(1, firstArea);
        Locations miningColony257  = new Locations(2, secondArea) ;
        Locations marsColony78  = new Locations(3, thirdArea) ;
        Locations moonColony56  = new Locations(4, fourthArea) ;
        Locations earthColony23  = new Locations(5, fifthArea) ;

        locationMap.put(1, miningColony321);
        locationMap.put(2, miningColony257);
        locationMap.put(3, marsColony78);
        locationMap.put(4, moonColony56);
        locationMap.put(5, earthColony23);

        return locationMap;
    }


    public Locations getCurrentLocation(int locationId){
        Locations currentLocation = new Locations();
        if (locationMap.containsKey(locationId)) {
            currentLocation  = mapOfLocations(locationId).get(locationId);
        }
        return currentLocation;
    }

//    public int calculateFuelUsedToDestination(int locationId) {
////        int distanceFuelUsed = 50;
//
//        int distanceFuelUsed = 50 * (locationId - id);
//        if (distanceFuelUsed < 0){
//            distanceFuelUsed = distanceFuelUsed * -1;
//        }
////
//        return distanceFuelUsed;
//    }

    public List<Locations> listOfLocations (){
        List<Locations> locationsList = new ArrayList<>();
        for (Map.Entry<Integer, Locations> location : locationMap.entrySet()){
            locationsList.add( location.getValue());
        }
        return locationsList;
    }
















}
