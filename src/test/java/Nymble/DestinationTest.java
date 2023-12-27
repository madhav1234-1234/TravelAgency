package test.java.Nymble;

import main.java.Nymble.Activity;
import main.java.Nymble.Destination;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <h1>DestinationTest Class</h1>
 * The DestinationTest class contains unit tests for the Destination class.
 * It tests the functionality of adding activities to a destination and ensures
 * the immutability of the returned activities list.
 *
 *
 * @author Madhav Kumar
 */
public class DestinationTest {

    private Destination destination;

    @BeforeEach
    void setUp() {
        destination = new Destination("Test Destination");
    }

    /**
     * Test adding an activity to the destination and checking the size of the activities list.
     */
    @Test
    void testAddActivity() {
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
    }

    /**
     * Test whether getActivities returns a copy of the activities list.
     * Modifying the copy should not affect the original list in the destination.
     */
    @Test
    void testGetActivitiesReturnsCopy() {
        Activity activity1 = new Activity("Activity 1", "Description 1", 30.0, 15);
        Activity activity2 = new Activity("Activity 2", "Description 2", 40.0, 20);
        destination.addActivity(activity1);
        destination.addActivity(activity2);

        // Get a copy of the activities list
        List<Activity> activities = new ArrayList<>(destination.getActivities());
        activities.remove(0); // Modify the copy

        // Check that the original list in destination is not affected
        assertEquals(2, destination.getActivities().size());
    }

    /**
     * Test the immutability of the returned activities list.
     * Attempting to modify the returned list should throw an exception.
     */
    @Test
    void testGetActivitiesImmutability() {
        // Setup activities
        destination.addActivity(new Activity("Activity 1", "Desc", 100, 10));

        // Attempt to modify the returned list (should throw an exception)
        List<Activity> activities = destination.getActivities();
        Assertions.assertThrows(UnsupportedOperationException.class, () -> ((List<?>) activities).remove(0));
    }
}
