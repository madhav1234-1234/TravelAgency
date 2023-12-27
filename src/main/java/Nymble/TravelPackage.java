package main.java.Nymble;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>TravelPackage Class</h1>
 * The TravelPackage class represents a travel package with destinations and passengers.
 * It provides methods to manage destinations and passengers, and print itinerary and passenger lists.
 * <p>
 * <b>Note:</b> Clear code documentation enhances understanding and maintenance.
 *
 * @author Madhav Kumar

 */
public class TravelPackage {
    private String name; // The name of the travel package.
    private int passengerCapacity; // The maximum number of passengers that can enroll in the package.
    private List<Destination> itinerary; // List of destinations included in the travel package's itinerary.
    private List<Passenger> passengers; // List of passengers enrolled in the travel package.

    /**
     * Constructor to initialize a travel package.
     *
     * @param name             The name of the travel package.
     * @param passengerCapacity The maximum number of passengers that can enroll in the package.
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    /**
     * Method to add a destination to the travel package's itinerary.
     *
     * @param destination The destination to add.
     */
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    /**
     * Method to add a passenger to the travel package.
     *
     * @param passenger The passenger to add.
     * @throws IllegalStateException if the travel package is already full.
     */
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            throw new IllegalStateException("Travel package is full");
        }
    }

    /**
     * Method to print the itinerary of the travel package, including destinations and activities.
     */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println(" - Activity: " + activity.getName() + ", Cost: " + String.format("%.1f", activity.getCost()) + ", Capacity: " + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    /**
     * Method to print the list of passengers in the travel package.
     */
    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println(" - Name: " + passenger.getName() + ", Number: " + passenger.getPassengerNumber());
        }
    }

    // Getters and Setters for travel package fields

    /**
     * Get the name of the travel package.
     *
     * @return The name of the travel package.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the maximum passenger capacity of the travel package.
     *
     * @return The maximum passenger capacity of the travel package.
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Get a copy of the itinerary (destinations) of the travel package for encapsulation.
     *
     * @return A copy of the itinerary.
     */
    public List<Destination> getItinerary() {
        return new ArrayList<>(itinerary);
    }

    /**
     * Get a copy of the passengers enrolled in the travel package for encapsulation.
     *
     * @return A copy of the passengers list.
     */
    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    /**
     * Set the name of the travel package.
     *
     * @param name The new name for the travel package.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the maximum passenger capacity of the travel package.
     *
     * @param passengerCapacity The new passenger capacity for the travel package.
     */
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
