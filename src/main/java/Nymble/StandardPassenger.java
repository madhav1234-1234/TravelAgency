package main.java.Nymble;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>StandardPassenger Class</h1>
 * The StandardPassenger class represents a standard passenger with a balance
 * who can sign up for activities based on their available balance.
 * It extends the Passenger class and overrides specific methods.
 * <p>
 *
 * @author Madhav Kumar
 */
public class StandardPassenger extends Passenger {
    private double balance; // The balance of the standard passenger.
    private List<Activity> enrolledActivities = new ArrayList<>(); // List of activities the standard passenger is enrolled in.

    /**
     * Constructor to initialize standard passenger information.
     *
     * @param name           The name of the standard passenger.
     * @param passengerNumber The unique passenger number assigned to the standard passenger.
     * @param balance        The balance available to the standard passenger for enrolling in activities.
     */
    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber); // Call the constructor of the superclass with name and passengerNumber
        this.balance = balance;
    }

    /**
     * Override the signUpForActivity method to allow standard passengers to sign up for activities based on their available balance.
     *
     * @param activity The activity to sign up for.
     * @return true if enrollment is successful, false otherwise.
     */
    @Override
    public boolean signUpForActivity(Activity activity) {
        // Check if the balance is sufficient and enroll in the activity
        if (balance >= activity.getCost() && activity.enrollPassenger(this)) {
            balance -= activity.getCost();
            enrolledActivities.add(activity);
            return true; // Enrollment successful
        }
        return false; // Enrollment failed
    }

    /**
     * Override the printDetails method to display StandardPassenger-specific details.
     */
    @Override
    public void printDetails() {
        System.out.println("Standard Passenger: " + getName() + ", Number: " + getPassengerNumber());
        System.out.println("Balance: " + balance);
        System.out.println("Enrolled Activities:");
        for (Activity activity : enrolledActivities) {
            System.out.println("- " + activity.getName() + ", Cost: " + activity.getCost()   );
        }

    }

    /**
     * Get the balance of the standard passenger.
     *
     * @return The balance of the standard passenger.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set the balance of the standard passenger.
     *
     * @param balance The new balance for the standard passenger.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
