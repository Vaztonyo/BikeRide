package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void shouldTakeMountainBikeOnBikeRide() {
        MountainBike bicycle = new MountainBike();

        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 19);
    }

    @Test
    public void shouldTakeRoadBikeOnBikeRide() {
        RoadBike bicycle = new RoadBike();

        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 47);
    }

}
