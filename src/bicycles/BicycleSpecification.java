package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    // add a variable for brakeSpeed
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        // initialize brakeSpeed private variable
        this.brakeSpeed = brakeSpeed;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    // add getters for brakeSpeed
    public int getBrakeSpeed(){
        return brakeSpeed;
    }
}
