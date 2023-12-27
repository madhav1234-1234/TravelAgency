package main.java.Nymble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>Destination Class</h1>
 * The Destination class represents a location or place that offers various activities.
 * It tracks the name of the destination and a list of activities available there.
 * <p>
 *
 * @author Madhav Kumar

 */
public class Destination {
    // Fields for a Destination
    private String name; // The name of the destination.
    private List<Activity> activities; // List of activities available at the destination.

    /**
     * Constructor to initialize a Destination.
     *
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Add an activity to the destination.
     *
     * @param activity The activity to add to the destination.
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * Get a list of activities at the destination that still have spaces available.
     *
     * @return A list of available activities.
     */
    public List<Activity> getAvailableActivities() {
        List<Activity> availableActivities = new ArrayList<>();
        for (Activity activity : activities) {
            if (activity.getCurrentEnrollment() < activity.getCapacity()) {
                availableActivities.add(activity);
            }
        }
        return availableActivities;
    }

    // Getters and Setters for Destination fields

    /**
     * Get the name of the destination.
     *
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Get an unmodifiable view of the list of activities available at the destination.
     *
     * @return An unmodifiable list of activities.
     */
    public List<Activity> getActivities() {
        return Collections.unmodifiableList(new ArrayList<>(activities));
    }

    /**
     * Set the name of the destination.
     *
     * @param name The new name for the destination.
     */
    public void setName(String name) {
        this.name = name;
    }
}
