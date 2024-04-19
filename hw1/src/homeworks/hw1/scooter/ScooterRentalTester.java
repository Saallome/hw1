package homeworks.hw1.scooter;

import java.util.Timer;
import java.util.TimerTask;

public class ScooterRentalTester {

    public static void main(String[] args) {
        // Create a rental company
        RentalCompany rentalCompany = new RentalCompany();

        // Create a scooter
        Scooter scooter = new Scooter();
        scooter.setModel("Sparrow X10");
        scooter.setBatteryLevel(100);
        scooter.setX(41.647461);
        scooter.setY(44.896930);
        scooter.setAvailable(true);

        // Add the scooter to the rental company's fleet
        rentalCompany.addScooter(scooter);

        // Rent the scooter and go from home to the university
        rentalCompany.rentScooter(scooter.getId());
        System.out.println("Scooter rented. Going from home to the University...");

        // Set the coordinates of the university
        double universityX = 41.7121106;
        double universityY = 44.7489232;

        // Move to the university
        scooter.setX(universityX);
        scooter.setY(universityY);

        // Print current location
        System.out.println("Scooter current location: (" + scooter.getX() + ", " + scooter.getY() + ")");

        // Leave the scooter at the university after 1 hour
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                rentalCompany.returnScooter(scooter.getId(), universityX, universityY);
                System.out.println("Scooter returned to the University.");
                // Rent the scooter again after 1 hour
                rentAgain(rentalCompany, scooter);
            }
        }, 3600000); // 1 hour in milliseconds
    }

    // Method to rent the scooter again after a specified time
    private static void rentAgain(RentalCompany rentalCompany, Scooter scooter) {
        // Rent the scooter again after 1 hour
        rentalCompany.rentScooter(scooter.getId());
        System.out.println("Scooter rented again. Going back home...");

        // Set the coordinates of home
        double homeX = 41.647461;
        double homeY = 44.896930;

        // Move back home
        scooter.setX(homeX);
        scooter.setY(homeY);

        // Print current location
        System.out.println("Scooter current location: (" + scooter.getX() + ", " + scooter.getY() + ")");

        // Leave the scooter near home
        rentalCompany.returnScooter(scooter.getId(), homeX, homeY);
        System.out.println("Scooter returned near home.");
    }
}
