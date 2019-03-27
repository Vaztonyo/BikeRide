package bicycles.models;

//import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;


public class MountainBike  extends BicycleBase {
    private int accelerationSpeed = 5;
    private int brakeSpeed = -3;

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
        return BicycleType.MountainBike;
    }
}