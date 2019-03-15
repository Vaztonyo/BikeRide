package bicycles.models;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class RoadBike extends BikeRide implements Bicycle {

    private int speed;

    public RoadBike(RoadBike roadBike) {
        super(roadBike);
    }

    public RoadBike() {
        super();
    }

    @Override
    public void accelerate() {
        speed += 11;
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 4;
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
