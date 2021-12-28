/*
* The "Vehicle" class
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-27
*/

public class Vehicle {

    // the Vehicle class has two fields
    private String licensePlate;
    private String colour = "Really Red";
    private int numberOfDoors = 4;
    private int speed = 0;
    private int maximumSpeed = 180;
    

    // getters

    /**
    * Getter for license plate.
    */
    public String getLicensePlate(){
        return this.licensePlate;
    }

    /**
    * Getter for colour.
    */
    public String getColour() {
        return this.colour;
    }

    // setters

    /**
    * Setter for license plate.
    */
    public void setLicensePlate(String newPlate) {
        this.licensePlate = newPlate;
    }

    /**
    * Setter for colour.
    */
    public void setColour(String newColour) {
        this.colour = newColour;
    }

    // methods

    /**
    * The doors() method tells the user how many doors the vehicle has.
    */
    private void doors() {
        System.out.println("\nThe car has" + numberOfDoors + " doors.");
    }

    /**
    * The currentSpeed() method tells the user the current speed the vehicle is
    * moving.
    */
    private void currentSpeed() {
        System.out.println("\nThe car is moving at " + speed + " mph.");
    }

    /**
    * The maximumSpeed() method tells the user the maximum speed the vehicle is
    * moving.
    */
    private void maximumSpeed() {
        System.out.println("\nThe car's maximum speed is " + maximumSpeed +
            " mph.");
    }

    /**
    * The accelerate() method lets the user speed up the vehicle.
    */
    public int accelerate(final int acceleration) {
        if (maximumSpeed <= speed + acceleration) {
            System.out.print("\nYou cannot accelerate that much! Your speed");
            speed = maximumSpeed;
            System.out.println(" was set to " + speed " mph.");
        } else if (acceleration <= 0);
            System.out.println("\nYou have to enter a positive integer!");
        } else {
            speed = speed + acceleration;
            System.out.println("\nYour speed was set to " + speed + " mph.");
        }
    }

    /**
    * The brake() method lets the user slow down the vehicle.
    */
    public int brake(final int brakes) {
        if (brakes <= 0) {
            System.out.println("\nYou have to enter a positive integer!");
        } else if (brakes > speed) {
            System.out.print("\nYou cannot go slower than 0 mph! You speed ");
            speed = 0;
            System.out.println(" was set to " + speed + " mph.");
        } else {
            speed = speed - brakes;
            System.out.println("\nYour speed was set to " + speed + " mph.");
        }
    }
}