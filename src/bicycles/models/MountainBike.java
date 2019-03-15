package bicycles.models;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class MountainBike extends BikeRide implements Bicycle {
    private int speed;

    public MountainBike(MountainBike mountainBike) {
        super(mountainBike);
    }

    public MountainBike() {
        super();
    }

    @Override
    public void accelerate() {
        speed += 5;
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 3;
        } else {
            speed = 0;
        }
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }
}
