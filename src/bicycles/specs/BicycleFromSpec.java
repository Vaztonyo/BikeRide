package bicycles.specs;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {

    public BicycleSpecification bicycle;

    public BicycleFromSpec(BicycleSpecification bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        changeSpeed(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(this.bicycle.getBrakeSpeed());
    }
}
