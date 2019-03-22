package bicycles.specs;

import bicycles.BicycleType;

public class BicycleSpecification {

    private BicycleType bicycleType;
    private int accelerationSpeed;
    // add a variable for brakeSpeed
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        // initialize brakeSpeed private variable
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    // add getters for brakeSpeed

    public int getBrakeSpeed(){
        return brakeSpeed;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }
}
