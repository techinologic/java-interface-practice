/**
 * Created by Paopao on 08/09/17.
 */
public class Main {

    public static void main(String[] args) {
        int impact = 2;
        Vehicle car = new Vehicle(4, 120);

        System.out.println("Cars max speed is: " + car.getSpeed());
        System.out.println("Number of wheels: " + car.getWheels());

        car.setCarStrength(10);
        System.out.println("Strength: " + car.getCarStrength());

        car.youCrashed(2);

        if (car.carDrivable) {
            System.out.println("You crashed with " + impact
                    + " impact. Car is still drivable");
        } else {
            System.out.println("You crashed. Car is NOT drivable");
        }
    }
}
