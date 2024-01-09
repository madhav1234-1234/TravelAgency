//package main.java.Nymble;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * <h1>Activity Class</h1>
// * The Activity class represents an event or program that passengers can enroll in.
// * It tracks the name, description, cost, capacity, and enrollment details.
// * <p>
// *
// * @author Madhav Kumar
// */
//public class Activity {
//    // Fields for an Activity
//    private String name; // The name of the activity.
//    private String description; // A brief description of the activity.
//    private double cost; // The cost associated with enrolling in the activity.
//    private int capacity; // The maximum number of passengers the activity can enroll.
//    private int currentEnrollment; // The current number of enrolled passengers.
//    private Set<Passenger> enrolledPassengers; // Set to store enrolled passengers.
//
//    /**
//     * Constructor to initialize an Activity.
//     *
//     * @param name        The name of the activity.
//     * @param description A brief description of the activity.
//     * @param cost        The cost associated with enrolling in the activity.
//     * @param capacity    The maximum number of passengers the activity can enroll.
//     */
//    public Activity(String name, String description, double cost, int capacity) {
//        this.name = name;
//        this.description = description;
//        this.cost = cost;
//        this.capacity = capacity;
//        this.currentEnrollment = 0;
//        this.enrolledPassengers = new HashSet<>();
//    }
//
//    /**
//     * Enroll a passenger in the activity if there is capacity and the passenger is not already enrolled.
//     *
//     * @param passenger The passenger to enroll.
//     * @return true if enrollment is successful, false otherwise.
//     */
//    public boolean enrollPassenger(Passenger passenger) {
//        // Check if there is capacity and if the passenger is not already enrolled
//        if (currentEnrollment < capacity && !enrolledPassengers.contains(passenger)) {
//            enrolledPassengers.add(passenger);
//            currentEnrollment++;
//            return true; // Enrollment successful
//        }
//        return false; // Enrollment failed
//    }
//
//    // Getters and Setters for Activity fields
//
//    /**
//     * Get the name of the activity.
//     *
//     * @return The name of the activity.
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * Get a brief description of the activity.
//     *
//     * @return A brief description of the activity.
//     */
//    public String getDescription() {
//        return description;
//    }
//
//    /**
//     * Get the cost associated with enrolling in the activity.
//     *
//     * @return The cost of enrolling in the activity.
//     */
//    public double getCost() {
//        return cost;
//    }
//
//    /**
//     * Get the maximum number of passengers the activity can enroll.
//     *
//     * @return The capacity of the activity.
//     */
//    public int getCapacity() {
//        return capacity;
//    }
//
//    /**
//     * Get the current number of enrolled passengers.
//     *
//     * @return The current enrollment count.
//     */
//    public int getCurrentEnrollment() {
//        return currentEnrollment;
//    }
//
//    /**
//     * Set the name of the activity.
//     *
//     * @param name The new name for the activity.
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * Set a brief description of the activity.
//     *
//     * @param description The new description for the activity.
//     */
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    /**
//     * Set the cost associated with enrolling in the activity.
//     *
//     * @param cost The new cost for enrolling in the activity.
//     */
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
//
//    /**
//     * Set the maximum number of passengers the activity can enroll.
//     *
//     * @param capacity The new capacity for the activity.
//     */
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//}



package main.java.Nymble;

import java.util.HashSet;
import java.util.Set;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int currentEnrollment;



    private int spaceAvailableInActivity;
    private Set<Passenger> enrolledPassengers;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.currentEnrollment = 0;
        this.enrolledPassengers = new HashSet<>();
    }

    public boolean enrollPassenger(Passenger passenger) {
        if (currentEnrollment < capacity && !enrolledPassengers.contains(passenger)) {
            enrolledPassengers.add(passenger);
            currentEnrollment++;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    public int getSpaceAvailableInActivity() {
        return spaceAvailableInActivity;
    }

    public void setSpaceAvailableInActivity(int spaceAvailableInActivity) {
        this.spaceAvailableInActivity = spaceAvailableInActivity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
