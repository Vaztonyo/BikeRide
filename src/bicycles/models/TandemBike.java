package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class TandemBike extends BicycleBase {
    private int accelerationSpeed = 12;
    private int brakeSpeed = -7;

    @Override
    public void accelerate() {
        changeSpeed(accelerationSpeed);
    }

    @Override
    public void brake() {
        changeSpeed(brakeSpeed);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.TandemBike;
    }
}
