/**
 * Created by Paopao on 08/09/17.
 */
public class Vehicle implements Drivable {

    int numWheels = 2;
    int speed = 0;

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
}
