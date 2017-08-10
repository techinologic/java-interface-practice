/**
 * Created by Paopao on 08/09/17.
 */
public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, 120);

        System.out.println("Cars max speed is: " + car.getSpeed());
        System.out.println("Number of wheels: " + car.getWheels());

        car.setCarStrength(10);
        System.out.println("Strenght: " + car.getCarStrength());
    }
}
