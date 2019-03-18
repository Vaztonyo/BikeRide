package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import bicycles.rides.BikeRide1;
import bicycles.rides.BikeRide2;
import bicycles.rides.BikeRide3;


public class BikeRideTest {

    public static class BikeRide1Test {
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

    public static class BikeRide2Test {
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

    public static class BikeRide3Test {
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




}
