package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRide2 implements BikeRide {

    private Bicycle bicycle;

    public BikeRide2(Bicycle bicycle) {

        this.bicycle = bicycle;

    }

    @Override
    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }

    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }
}
