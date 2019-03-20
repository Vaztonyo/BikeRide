package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.rides.BikeRide3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRide3Test {
    @Test
    public void shouldTakeMountainBikeOnBikeRide() {
        MountainBike bicycle = new MountainBike();

        BikeRide3 bikeRide = new BikeRide3(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 37);
    }

    @Test
    public void shouldTakeRoadBikeOnBikeRide() {
        RoadBike bicycle = new RoadBike();

        BikeRide3 bikeRide = new BikeRide3(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 97);
    }
}
