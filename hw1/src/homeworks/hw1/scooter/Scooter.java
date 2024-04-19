package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a scooter available for rental.
 */
public class Scooter {

    // Unique identifier for the scooter.
    private int id;

    // Model name of the scooter (e.g., Sparrow X10).
    private String model;

    // Current battery level (percentage).
    private int batteryLevel;

    // Scooter location;
    private double x, y;

    // Indicates if the scooter is available
    private boolean available;

    /**
     * Retrieves the ID of the scooter.
     *
     * @return The ID of the scooter
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the scooter.
     *
     * @param id The ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the model name of the scooter.
     *
     * @return The model name of the scooter
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model name of the scooter.
     *
     * @param model The model name to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retrieves the battery level of the scooter.
     *
     * @return The battery level of the scooter
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * Sets the battery level of the scooter.
     *
     * @param batteryLevel The battery level to set
     */
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * Retrieves the X-coordinate of the scooter's location.
     *
     * @return The X-coordinate of the scooter's location
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the X-coordinate of the scooter's location.
     *
     * @param x The X-coordinate to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retrieves the Y-coordinate of the scooter's location.
     *
     * @return The Y-coordinate of the scooter's location
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the Y-coordinate of the scooter's location.
     *
     * @param y The Y-coordinate to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Checks if the scooter is available for rental.
     *
     * @return True if the scooter is available, otherwise false
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the availability status of the scooter.
     *
     * @param available The availability status to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Returns a string representation of the scooter.
     *
     * @return A string representation of the scooter
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
