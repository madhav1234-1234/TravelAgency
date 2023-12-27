package main.java.Nymble;

/**
 * <h1>GoldPassenger Class</h1>
 * The GoldPassenger class represents a passenger with a gold membership,
 * providing a 10% discount on activity enrollments.
 * It extends the StandardPassenger class and overrides specific methods.
 * <p>
 *
 * @author Madhav Kumar

 */
public class GoldPassenger extends StandardPassenger {

    /**
     * Constructor for GoldPassenger.
     *
     * @param name           The name of the gold passenger.
     * @param passengerNumber The passenger number assigned to the gold passenger.
     * @param balance        The balance associated with the gold passenger's account.
     */
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

    /**
     * Override the signUpForActivity method with a 10% discount for GoldPassengers.
     *
     * @param activity The activity to enroll in.
     * @return true if enrollment is successful after applying the discount, false otherwise.
     */
    @Override
    public boolean signUpForActivity(Activity activity) {
        double discountedCost = activity.getCost() * 0.9; // 10% discount
        if (getBalance() >= discountedCost && activity.enrollPassenger(this)) {
            setBalance(getBalance() - discountedCost);
            return true; // Enrollment successful
        }
        return false; // Enrollment failed
    }

    /**
     * Override the printDetails method to display GoldPassenger-specific details.
     */
    @Override
    public void printDetails() {
        System.out.println("Gold Passenger: " + getName() + ", Number: " + getPassengerNumber());
        System.out.println("Balance: " + getBalance());
        // Print enrolled activities (inherited from StandardPassenger)
    }
}
