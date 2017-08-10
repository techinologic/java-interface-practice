/**
 * Created by Paopao on 08/09/17.
 */
public class Vehicle extends Crashable implements Drivable {

    int numWheels = 2;
    int speed = 0;
    private int carStrength = 0;

    public int getWheels() {
        return this.numWheels;
    }

    public void setWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    // constructor

    public Vehicle(int wheels, int speed) {
        this.numWheels = wheels;
        this.speed = speed;
    }

    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }

    public int getCarStrength() {
        return this.carStrength = carStrength;
    }
}
