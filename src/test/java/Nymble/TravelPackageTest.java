package test.java.Nymble;

import main.java.Nymble.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>TravelPackageTest Class</h1>
 * The TravelPackageTest class contains unit tests for the TravelPackage class. It tests the functionality of adding destinations,
 * adding passengers, printing the itinerary, and printing the passenger list of a travel package.
 * <p>
 *
 * @author Madhav Kumar
 */
public class TravelPackageTest {

    private TravelPackage travelPackage;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        travelPackage = new TravelPackage("Test Package", 5);
        System.setOut(new PrintStream(outputStreamCaptor)); // Redirect System.out to capture output
    }

    /**
     * Test adding a destination to the travel package.
     * Should add a destination to the itinerary.
     */
    @Test
    void testAddDestination() {
        Destination destination = new Destination("Test Destination");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getItinerary().size());
    }

    /**
     * Test adding a passenger to the travel package.
     * Should add a passenger to the list of passengers.
     */
    @Test
    void testAddPassenger() {
        Passenger passenger = new StandardPassenger("John Doe", 101, 200.0);
        travelPackage.addPassenger(passenger);
        assertEquals(1, travelPackage.getPassengers().size());
    }

    /**
     * Test attempting to add a passenger when the capacity is exceeded.
     * Should throw an IllegalStateException.
     */
    @Test
    void testAddPassengerExceedingCapacity() {
        for (int i = 0; i < 5; i++) {
            travelPackage.addPassenger(new StandardPassenger("Passenger " + i, 100 + i, 200.0));
        }

        Exception exception = Assertions.assertThrows(IllegalStateException.class, () -> {
            travelPackage.addPassenger(new StandardPassenger("Extra Passenger", 106, 200.0));
        });

        String expectedMessage = "Travel package is full";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Test printing the itinerary of the travel package.
     * Should print the itinerary details.
     */
    @Test
    public void testPrintItinerary() {
        // Create a TravelPackage
        TravelPackage travelPackage = new TravelPackage("Test Package", 3);

        // Create destinations and activities
        Destination destination1 = new Destination("Destination 1");
        Activity activity1 = new Activity("Activity 1", "Description 1", 100.0, 10);
        Activity activity2 = new Activity("Activity 2", "Description 2", 120.0, 15);
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);

        Destination destination2 = new Destination("Destination 2");
        Activity activity3 = new Activity("Activity 3", "Description 3", 250.0, 20);
        destination2.addActivity(activity3);

        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Redirect System.out to capture output
        System.setOut(new PrintStream(outputStreamCaptor));

        // Call the printItinerary method
        travelPackage.printItinerary();

        // Get the system-specific line separator
        String lineSeparator = System.lineSeparator();

        // Verify the output with the correct line separator
        String expectedOutput = "Travel Package: Test Package" + lineSeparator +
                "Destination: Destination 1" + lineSeparator +
                " - Activity: Activity 1, Cost: 100.0, Capacity: 10, Description: Description 1" + lineSeparator +
                " - Activity: Activity 2, Cost: 120.0, Capacity: 15, Description: Description 2" + lineSeparator +
                "Destination: Destination 2" + lineSeparator +
                " - Activity: Activity 3, Cost: 250.0, Capacity: 20, Description: Description 3" + lineSeparator;

        // Use assertEquals to compare the expected output with captured output
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    /**
     * Test printing the passenger list of the travel package.
     * Should print the passenger list details.
     */
    @Test
    void testPrintPassengerList() {
        // Create passengers
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new StandardPassenger("John Doe", 101, 200.0));
        passengers.add(new StandardPassenger("Jane Smith", 102, 250.0));
        passengers.add(new GoldPassenger("Alice Johnson", 103, 300.0));
        passengers.add(new PremiumPassenger("Bob Brown", 104));

        // Add passengers to the travel package
        for (Passenger passenger : passengers) {
            travelPackage.addPassenger(passenger);
        }

        // Redirect System.out to capture output
        System.setOut(new PrintStream(outputStreamCaptor));
        String lineSeparator = System.lineSeparator();

        // Call the printPassengerList method
        travelPackage.printPassengerList();

        // Verify the output with normalized line separators
        String expectedOutput = "Travel Package: Test Package" + lineSeparator +
                "Passenger Capacity: 5" + lineSeparator +
                "Number of Passengers Enrolled: 4" + lineSeparator +
                " - Name: John Doe, Number: 101" + lineSeparator +
                " - Name: Jane Smith, Number: 102" + lineSeparator +
                " - Name: Alice Johnson, Number: 103" + lineSeparator +
                " - Name: Bob Brown, Number: 104" + lineSeparator;

        // Normalize line separators in both expected and captured output
        String normalizedExpected = expectedOutput.replaceAll("\r\n", "\n");
        String normalizedCaptured = outputStreamCaptor.toString().replaceAll("\r\n", "\n");

        // Use assertEquals to compare the normalized expected output with normalized captured output
        Assertions.assertEquals(normalizedExpected, normalizedCaptured);
    }

    /**
     * Test getters of the travel package.
     * Should return correct values for travel package fields.
     */
    @Test
    public void testGetters() {
        // Create a TravelPackage
        TravelPackage travelPackage = new TravelPackage("Test Package", 3);

        // Check the getters
        assertEquals("Test Package", travelPackage.getName());
        assertEquals(3, travelPackage.getPassengerCapacity());
        assertEquals(0, travelPackage.getItinerary().size());
        assertEquals(0, travelPackage.getPassengers().size());
    }

}
