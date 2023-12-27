package main.java.Nymble;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>PremiumPassenger Class</h1>
 * The PremiumPassenger class represents a premium passenger with additional benefits
 * who can sign up for activities without checking their balance.
 * It extends the Passenger class and overrides specific methods.
 * <p>
 *
 * @author Madhav Kumar
 */
public class PremiumPassenger extends Passenger {
    private List<Activity> enrolledActivities = new ArrayList<>(); // List of activities the premium passenger is enrolled in.

    /**
     * Constructor to initialize premium passenger information.
     *
     * @param name           The name of the premium passenger.
     * @param passengerNumber The unique passenger number assigned to the premium passenger.
     */
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    /**
     * Override the signUpForActivity method to allow premium passengers to sign up for any activity without checking the balance.
     *
     * @param activity The activity to sign up for.
     * @return true if enrollment is successful, false otherwise.
     */
    @Override
    public boolean signUpForActivity(Activity activity) {
        if (activity.enrollPassenger(this)) {
            enrolledActivities.add(activity);
            return true; // Enrollment successful
        }
        return false; // Enrollment failed
    }

    /**
     * Override the printDetails method to display PremiumPassenger-specific details.
     */
    @Override
    public void printDetails() {
        System.out.println("Premium Passenger: " + getName() + ", Number: " + getPassengerNumber());
        System.out.println("Enrolled Activities:");
        for (Activity activity : enrolledActivities) {
            System.out.println("- " + activity.getName());
        }
    }
}
