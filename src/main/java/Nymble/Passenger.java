package main.java.Nymble;

/**
 * <h1>Passenger Class (Abstract)</h1>
 * The abstract Passenger class represents a traveler with basic information.
 * It serves as the base class for various types of passengers.
 * <p>
 * Subclasses of Passenger are expected to implement methods for signing up for activities
 * and printing passenger details.
 * <p>
 *
 * @author Madhav Kumar

 */
public abstract class Passenger {
    private String name; // The name of the passenger.
    private int passengerNumber; // The unique passenger number.

    /**
     * Constructor to initialize passenger information.
     *
     * @param name           The name of the passenger.
     * @param passengerNumber The unique passenger number assigned to the passenger.
     */
    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
    }

    /**
     * Abstract method for passengers to sign up for an activity.
     *
     * @param activity The activity to sign up for.
     * @return true if enrollment is successful, false otherwise.
     */
    public abstract boolean signUpForActivity(Activity activity);

    /**
     * Abstract method to print passenger details.
     */
    public abstract void printDetails();

    // Getters and Setters for passenger fields

    /**
     * Get the name of the passenger.
     *
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the unique passenger number.
     *
     * @return The unique passenger number.
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * Set the name of the passenger.
     *
     * @param name The new name for the passenger.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the unique passenger number.
     *
     * @param passengerNumber The new passenger number.
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
