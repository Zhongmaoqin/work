/**
 * Initial output: "The object's position after 10.0 seconds is 0.0 m."
 * Description: This class include entry main method, it will calculate distance by the gravity in the method.
 */
public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        // calculate final position
        finalPosition = initialVelocity * fallingTime + 1 / 2.0 * gravity * fallingTime * fallingTime;
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }
}
