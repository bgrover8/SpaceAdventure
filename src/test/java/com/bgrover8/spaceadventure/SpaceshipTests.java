package com.bgrover8.spaceadventure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SpaceshipTests {


    private Spaceship spaceship;

    @Before
    public void setup() {
        spaceship = new Spaceship();
    }


    @Test
    public void add_fuel_adds_correctly_to_fuel_balance(){
        // this is testing that fuel added to the starting 50
        // will return the correct fuel total
        int fuel = spaceship.addFuel(100);
        Assert.assertEquals(150, fuel);
    }






}
