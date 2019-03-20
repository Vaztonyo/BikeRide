package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.rides.BikeRide1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRide1Test {
    @Test
    public void shouldTakeMountainBikeOnBikeRide() {
        MountainBike bicycle = new MountainBike();

        BikeRide1 bikeRide = new BikeRide1(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 19);
    }

    @Test
    public void shouldTakeRoadBikeOnBikeRide() {
        RoadBike bicycle = new RoadBike();

        BikeRide1 bikeRide = new BikeRide1(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 47);
    }
}
