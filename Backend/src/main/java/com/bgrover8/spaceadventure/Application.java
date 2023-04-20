package com.bgrover8.spaceadventure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

	private UI ui = new UI();
	private Spaceship spaceship = new Spaceship();
	private Locations locations = new Locations();
	private TravelChart travelChart = new TravelChart();
	private int locationId = 1;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Application application = new Application();
		application.run();
	}


	private void run() {
		// this will be the part of the app that runs
		// while the player is still playing
		// if they quit or complete the game it will end
		// then probably start over


		ui.firstMessage();
		// get the user input of their choice
		int userInput = -1;
		while (true){


			try {
				travelChart.mapOfLocations(locationId);
				travelChart.getCurrentLocation(locationId);
				statusLocation();
				userInput = ui.startMenu();
			}
			catch (Exception e ){
				ui.printMessage("Invalid Choice, please try again");
			}

			// have logic here to determine what menu prints
			// this is to limit the amount of loops needed
			if (userInput == 8 || userInput < 1 || userInput > 9){
				ui.printMessage("Invalid Choice, please try again.");
			}
			else if (userInput == 1) {
				// this is the Mine Nearby Resources

			}
			else if (userInput == 2) {
				// this is the travel menu
				while(true) {

					travelChart.getCurrentLocation(locationId);
					locationListToPrint();
					fuelNeeded();

					ui.travelMenu();
					if (userInput == 1){
						locationId = 1;

						break;
					}else if (userInput == 2){
						locationId = 2;
						break;
					}else if (userInput == 3){
						locationId = 3;

						break;
					}else if (userInput == 4){
						locationId = 4;

						break;
					}else if (userInput == 5){
						locationId = 5;

						break;
					}else if (userInput == 6){
						break;
					}else if (userInput == 7){
						statusSpaceship();
					}
					else if (userInput == 9){
						// this is the quit game
						//resets the location
						locationId = 1;
						// resets the money
						spaceship.setMoneybalance(0);
						// resets the fuel balance
						spaceship.setFuelLevel(50);
						// resets the resources
						spaceship.setResources(0);
						// print main menu again
						continue;
						//TODO
						// end the game
						// ask if you're sure?

					}
				}

			}
			else if (userInput == 7){
				// this is the status
				statusSpaceship();
			}
			else if (userInput == 9) {
				// this is the quit game
				//resets the location
				locationId = 1;
				// resets the money
				spaceship.setMoneybalance(0);
				// resets the fuel balance
				spaceship.setFuelLevel(50);
				// resets the resources
				spaceship.setResources(0);
				// print main menu again
				continue;
//
				//TODO
				// ask if you're sure?

			}

		}


	}
	// This is below the while loop
	// put other methods here to keep the while loop readable

	// this method prints correctly, getting the status of the spaceship
	private void statusSpaceship() {
		ui.printMessage("STATUS:");
		String fuelStatus = String.valueOf(spaceship.getFuelLevel());
		ui.printMessage("Fuel level: " + fuelStatus + "/150");
		String resourceStatus = String.valueOf(spaceship.getResources());
		ui.printMessage("Resource Amount: " + resourceStatus +"/150");
		String moneyBalance = String.valueOf(spaceship.getMoneybalance());
		ui.printMessage("Money Balance: " + moneyBalance);
	}

	// this prints correctly, retrieving the location name based on the id passed to the travel chart map
	private String statusLocation(){
		Locations location = travelChart.getCurrentLocation(locationId);
		String locationStatus = "You are located at: " + location.getAreaName();
		ui.printLocationMessage(locationStatus);
		return locationStatus;
	}

	// TODO this part doesn't work yet, the fuel needed isn't getting passed correctly
	private void fuelNeeded(){
		locations.setFuelNeededToGetHere(locationId);
		int fuelNeeded = locations.getFuelNeededToGetHere();
		ui.printFuelNeededMessage(fuelNeeded);
//        return fuelNeeded;
	}
	// this is passing a list of locations from the travelchart to the application then to the ui
	private List<Locations> locationListToPrint (){
		List<Locations> locationList = travelChart.listOfLocations();
		ui.getLocationInfo(locationList);
		return locationList;
	}

	//TODO make encounters with bandits
	// decision class? to keep track of the player's choices and the final outcome












}
