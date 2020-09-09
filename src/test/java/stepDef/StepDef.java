package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Rover;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StepDef {

    Rover rover = new Rover();
    @Given("rover turns left")
    public void rover_turns_left() {
        rover.turnLeft();
        System.out.println("Location: "+rover.printPosition());
        assertEquals("0 0 W", rover.printPosition());

    }


    @When("rover turns right")
    public void rover_turns_right() {
        rover.turnRight();
        System.out.println("Location: "+rover.printPosition());

        assertEquals("0 0 N",rover.printPosition());
    }


    @Then("rover moves one grid forward")
    public void rover_moves_one_grid_forward() {
        rover.move();
        System.out.println("Location: "+rover.printPosition());
        assertEquals("0 1 N",rover.printPosition());
    }



    @Given("rover moves to given location {int} {int} {int} and verify the location")
    public void rover_moves_to_given_location_and_verify_the_location(int x, int y, int facing) {
       String firstLocation = rover.printPosition();
        System.out.println("First Location: "+firstLocation);
        x=2; y=4; facing=2;
        rover.setPosition(x,y,facing);
        String newLocation= rover.printPosition();
        System.out.println("Last Location: "+newLocation);
        assertEquals("2 4 E",rover.printPosition());

        assertNotEquals(firstLocation,newLocation);
    }


    @Given("rover moves to given location {int} {int} {int}")
    public void rover_moves_to_given_location(int x, int y, int facing) {
        x=1; y=2; facing=1;
        System.out.println("First location: "+ rover.printPosition());

        rover.setPosition(x,y,facing);
        System.out.println("Location after new position: "+rover.printPosition());

    }


    @When("rover processing to move by letters {string} then verify the location")
    public void rover_processin_g_to_move_by_letters_then_verify_the_location(String processLetters) {
        processLetters="LMLMLMLMM";

        rover.process(processLetters);
        System.out.println("Location after processing: "+ rover.printPosition());
        assertEquals("1 3 N",rover.printPosition());
    }


}
