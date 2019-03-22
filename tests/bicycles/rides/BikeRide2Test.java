package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.rides.BikeRide2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRide2Test {
    @Test
    public void shouldTakeMountainBikeOnBikeRide() {
        MountainBike bicycle = new MountainBike();

        BikeRide2 bikeRide = new BikeRide2(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 26);
    }

    @Test
    public void shouldTakeRoadBikeOnBikeRide() {
        RoadBike bicycle = new RoadBike();

        BikeRide2 bikeRide = new BikeRide2(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 65);
    }
}