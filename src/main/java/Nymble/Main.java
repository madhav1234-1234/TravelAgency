package main.java.Nymble;

public class Main {
    public static void main(String[] args) {
        // Tour 1: European Tour
        TravelPackage europeanTour = new TravelPackage("European Tour", 30);
        setupEuropeanTour(europeanTour);

        // Tour 2: Asian Adventure
        TravelPackage asianAdventure = new TravelPackage("Asian Adventure", 25);
        setupAsianAdventure(asianAdventure);

        // Tour 3: American Expedition
        TravelPackage americanExpedition = new TravelPackage("American Expedition", 20);
        setupAmericanExpedition(americanExpedition);

        // Print details of each tour
        printTourDetails(europeanTour);
        printTourDetails(asianAdventure);
        printTourDetails(americanExpedition);
    }

    private static void setupEuropeanTour(TravelPackage europeanTour) {
        // Adding destinations to the European Tour
        Destination paris = new Destination("Paris");
        Destination rome = new Destination("Rome");
        Destination berlin = new Destination("Berlin");
        europeanTour.addDestination(paris);
        europeanTour.addDestination(rome);
        europeanTour.addDestination(berlin);

        // Adding activities to Paris
        Activity eiffelTowerVisit = new Activity("Eiffel Tower Visit", "Visit the iconic Eiffel Tower", 50.0, 15);
        Activity louvreTour = new Activity("Louvre Museum Tour", "Guided tour of the Louvre Museum", 60.0, 20);
        paris.addActivity(eiffelTowerVisit);
        paris.addActivity(louvreTour);

        // Adding activities to Rome
        Activity colosseumTour = new Activity("Colosseum Tour", "Guided tour of the Colosseum", 40.0, 20);
        Activity vaticanVisit = new Activity("Vatican Visit", "Tour of Vatican City and the Sistine Chapel", 55.0, 15);
        rome.addActivity(colosseumTour);
        rome.addActivity(vaticanVisit);


        // Adding activities to Berlin
        Activity brandenburgGate = new Activity("Brandenburg Gate", "Visit the historic Brandenburg Gate", 30.0, 25);
        Activity berlinWallTour = new Activity("Berlin Wall Tour", "Guided tour of the Berlin Wall remnants", 35.0, 20);
        berlin.addActivity(brandenburgGate);
        berlin.addActivity(berlinWallTour);

        // Create passengers for the European Tour
        StandardPassenger johnDoe = new StandardPassenger("John Doe", 101, 200.0);
        GoldPassenger aliceSmith = new GoldPassenger("Alice Smith", 102, 300.0);
        PremiumPassenger bobJohnson = new PremiumPassenger("Bob Johnson", 103);

        // Adding passengers to the European Tour
        europeanTour.addPassenger(johnDoe);
        europeanTour.addPassenger(aliceSmith);
        europeanTour.addPassenger(bobJohnson);

        // Passengers signing up for activities for the European Tour
        johnDoe.signUpForActivity(eiffelTowerVisit);
        aliceSmith.signUpForActivity(colosseumTour);
        bobJohnson.signUpForActivity(berlinWallTour);
    }

    private static void setupAsianAdventure(TravelPackage asianAdventure) {
        // Adding destinations to the Asian Adventure
        Destination tokyo = new Destination("Tokyo");
        Destination bangkok = new Destination("Bangkok");
        Destination delhi = new Destination("Delhi");
        asianAdventure.addDestination(tokyo);
        asianAdventure.addDestination(bangkok);
        asianAdventure.addDestination(delhi);

        // Adding activities to Tokyo
        Activity tokyoTowerVisit = new Activity("Tokyo Tower Visit", "Visit the famous Tokyo Tower", 30.0, 20);
        Activity sushiMakingClass = new Activity("Sushi Making Class", "Learn to make sushi with a local chef", 45.0, 10);
        tokyo.addActivity(tokyoTowerVisit);
        tokyo.addActivity(sushiMakingClass);

        // Adding activities to Bangkok
        Activity templeTour = new Activity("Temple Tour", "Explore historic temples in Bangkok", 25.0, 15);
        Activity thaiCookingClass = new Activity("Thai Cooking Class", "Cooking class for traditional Thai dishes", 40.0, 12);
        bangkok.addActivity(templeTour);
        bangkok.addActivity(thaiCookingClass);

        // Adding activities to Delhi
        Activity tajMahalTour = new Activity("Taj Mahal Tour", "Visit the iconic Taj Mahal in Agra", 60.0, 20);
        Activity delhiFoodTour = new Activity("Delhi Food Tour", "Explore the flavors of Delhi through a guided food tour", 30.0, 15);
        Activity rajasthanDesertSafari = new Activity("Rajasthan Desert Safari", "Experience a desert safari in Rajasthan", 75.0, 10);
        delhi.addActivity(tajMahalTour);
        delhi.addActivity(delhiFoodTour);
        delhi.addActivity(rajasthanDesertSafari);

        // Create passengers for the Asian Adventure
        StandardPassenger lisaChen = new StandardPassenger("Lisa Chen", 201, 250.0);
        GoldPassenger rajPatel = new GoldPassenger("Raj Patel", 202, 350.0);
        PremiumPassenger mariaGarcia = new PremiumPassenger("Maria Garcia", 203);

        // Adding passengers to the Asian Adventure
        asianAdventure.addPassenger(lisaChen);
        asianAdventure.addPassenger(rajPatel);
        asianAdventure.addPassenger(mariaGarcia);

        // Passengers signing up for activities for the Asian Adventure
        lisaChen.signUpForActivity(tokyoTowerVisit);
        rajPatel.signUpForActivity(delhiFoodTour);
        mariaGarcia.signUpForActivity(thaiCookingClass);
    }

    private static void setupAmericanExpedition(TravelPackage americanExpedition) {
        // Adding destinations to the American Expedition
        Destination newYork = new Destination("New York");
        Destination grandCanyon = new Destination("Grand Canyon");
        Destination lasVegas = new Destination("Las Vegas");
        Destination sanFrancisco = new Destination("San Francisco");
        americanExpedition.addDestination(newYork);
        americanExpedition.addDestination(grandCanyon);
        americanExpedition.addDestination(lasVegas);
        americanExpedition.addDestination(sanFrancisco);

        // Adding activities to New York
        Activity statueOfLibertyTour = new Activity("Statue of Liberty Tour", "Visit the iconic Statue of Liberty", 40.0, 20);
        Activity centralParkWalk = new Activity("Central Park Walk", "Guided walk through Central Park", 20.0, 30);
        newYork.addActivity(statueOfLibertyTour);
        newYork.addActivity(centralParkWalk);

        // Adding activities to Grand Canyon
        Activity canyonHike = new Activity("Canyon Hike", "Hiking tour of the Grand Canyon", 50.0, 15);
        Activity helicopterTour = new Activity("Helicopter Tour", "Helicopter tour over the Grand Canyon", 200.0, 5);
        grandCanyon.addActivity(canyonHike);
        grandCanyon.addActivity(helicopterTour);

        // Adding activities to Las Vegas
        Activity casinoNight = new Activity("Casino Night", "Experience the thrill of Las Vegas casinos", 100.0, 10);
        Activity vegasShow = new Activity("Vegas Show", "Enjoy a spectacular Las Vegas show", 150.0, 20);
        lasVegas.addActivity(casinoNight);
        lasVegas.addActivity(vegasShow);

        // Adding activities to San Francisco
        Activity goldenGateBridgeTour = new Activity("Golden Gate Bridge Tour", "Tour of the Golden Gate Bridge", 30.0, 25);
        Activity alcatrazVisit = new Activity("Alcatraz Visit", "Visit to Alcatraz Island", 45.0, 20);
        sanFrancisco.addActivity(goldenGateBridgeTour);
        sanFrancisco.addActivity(alcatrazVisit);

        // Create passengers for the American Expedition
        StandardPassenger emilyWilson = new StandardPassenger("Emily Wilson", 301, 500.0);
        GoldPassenger michaelBrown = new GoldPassenger("Michael Brown", 302, 600.0);
        PremiumPassenger sophiaMartinez = new PremiumPassenger("Sophia Martinez", 303);

        // Adding passengers to the American Expedition
        americanExpedition.addPassenger(emilyWilson);
        americanExpedition.addPassenger(michaelBrown);
        americanExpedition.addPassenger(sophiaMartinez);

        // Passengers signing up for activities for the American Expedition
        emilyWilson.signUpForActivity(canyonHike);
        michaelBrown.signUpForActivity(vegasShow);
        sophiaMartinez.signUpForActivity(goldenGateBridgeTour);
    }

    private static void printTourDetails(TravelPackage tour) {
        tour.printItinerary();
        tour.printPassengerList();
        for (Passenger passenger : tour.getPassengers()) {
            passenger.printDetails();
        }
    }
}
