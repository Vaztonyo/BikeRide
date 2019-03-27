package bicycles.models;

//import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;
import bicycles.specs.BicycleSpecification;


public class RoadBike  extends BicycleBase {

//    BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
    private int accelerationSpeed = 11;
    private int brakeSpeed = -4;

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
        return BicycleType.RoadBike;
    }

}
