package bicycles.models;

import bicycles.BicycleBase;

public class TandemBike extends BicycleBase {
    private int accelerationSpeed = 9;
    private int brakeSpeed = -5;

    @Override
    public void accelerate() {
        changeSpeed(accelerationSpeed);
    }

    @Override
    public void brake() {
        changeSpeed(brakeSpeed);
    }
}
