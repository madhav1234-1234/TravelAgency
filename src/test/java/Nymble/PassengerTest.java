package test.java.Nymble;

import main.java.Nymble.Activity;
import main.java.Nymble.StandardPassenger;
import main.java.Nymble.GoldPassenger;
import main.java.Nymble.PremiumPassenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>PassengerTest Class</h1>
 * The PassengerTest class contains unit tests for the passenger classes, including StandardPassenger,
 * GoldPassenger, and PremiumPassenger. It tests their functionality in signing up for activities with various scenarios.
 *
 *
 * @author Madhav Kumar

 */
public class PassengerTest {

    private Activity testActivity;
    private StandardPassenger standardPassenger;
    private GoldPassenger goldPassenger;
    private PremiumPassenger premiumPassenger;

    @BeforeEach
    void setUp() {
        testActivity = new Activity("Test Activity", "Description", 100.0, 2); // Capacity of 2 for testing
        standardPassenger = new StandardPassenger("John Doe", 101, 200.0);
        goldPassenger = new GoldPassenger("Alice Smith", 102, 200.0);
        premiumPassenger = new PremiumPassenger("Bob Brown", 103);
    }

    /**
     * Test standard passenger signing up for an activity.
     * Balance should be deducted after activity sign-up.
     */
    @Test
    void testStandardPassengerSignUpForActivity() {
        assertTrue(standardPassenger.signUpForActivity(testActivity));
        assertEquals(100.0, standardPassenger.getBalance(), "Balance should be deducted after activity sign-up.");
    }

    /**
     * Test gold passenger signing up for an activity with a discount.
     * Balance should be deducted with a 10% discount.
     */
    @Test
    void testGoldPassengerSignUpForActivityWithDiscount() {
        assertTrue(goldPassenger.signUpForActivity(testActivity));
        assertEquals(110.0, goldPassenger.getBalance(), "Balance should be deducted with a 10% discount.");
    }

    /**
     * Test premium passenger signing up for an activity (free for premium passengers).
     * No balance to check for PremiumPassenger.
     */
    @Test
    void testPremiumPassengerSignUpForActivityFree() {
        assertTrue(premiumPassenger.signUpForActivity(testActivity));
        // No balance to check for PremiumPassenger
    }

    /**
     * Test signing up for an activity when it's already full.
     * Should not sign up if activity is full.
     */
    @Test
    void testSignUpForFullActivity() {
        standardPassenger.signUpForActivity(testActivity);
        goldPassenger.signUpForActivity(testActivity); // Fills the activity

        assertFalse(premiumPassenger.signUpForActivity(testActivity), "Should not sign up if activity is full.");
    }

    /**
     * Test signing up for an activity without enough balance.
     * Should not sign up if balance is insufficient.
     */
    @Test
    void testSignUpForActivityWithoutEnoughBalance() {
        StandardPassenger poorPassenger = new StandardPassenger("Poor Passenger", 104, 50.0);
        assertFalse(poorPassenger.signUpForActivity(testActivity), "Should not sign up if balance is insufficient.");
    }
}
