package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    public static class MountainBikeTest {
        @Test
        public void shouldAccellerate() {
            MountainBike bicycle = new MountainBike();
            bicycle.accelerate();
            assertEquals(bicycle.currentSpeed(),5);
        }

        @Test
        public void shouldBrake() {
            MountainBike bicycle = new MountainBike();
            bicycle.accelerate();
            bicycle.brake();
            assertEquals(bicycle.currentSpeed(),  2);
        }

        @Test
        public void shouldStop() {
            MountainBike bicycle = new MountainBike();
            bicycle.accelerate();
            bicycle.stop();
            assertEquals(bicycle.currentSpeed(), 0);
        }

        @Test
        public void shouldGetCurrentSpeed() {
            MountainBike bicycle = new MountainBike();
            bicycle.accelerate();
            assertEquals(bicycle.currentSpeed(), 5);
        }
    }

    public static class RoadBikeTest {
        @Test
        public void shouldAccellerate() {
            RoadBike bicycle = new RoadBike();
            bicycle.accelerate();
            assertEquals(bicycle.currentSpeed(),11);
        }

        @Test
        public void shouldBrake() {
            RoadBike bicycle = new RoadBike();
            bicycle.accelerate();
            bicycle.brake();
            assertEquals(bicycle.currentSpeed(),  7);
        }

        @Test
        public void shouldStop() {
            RoadBike bicycle = new RoadBike();
            bicycle.accelerate();
            bicycle.stop();
            assertEquals(bicycle.currentSpeed(), 0);
        }

        @Test
        public void shouldGetCurrentSpeed() {
            RoadBike bicycle = new RoadBike();
            bicycle.accelerate();
            assertEquals(bicycle.currentSpeed(), 11);
            bicycle.accelerate();
            bicycle.brake();
            assertEquals(bicycle.currentSpeed(), 18);

        }
    }

}
