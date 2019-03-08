package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccellerate() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        assertEquals(bicycle.currentSpeed(),5);
    }

    @Test
    public void shouldBrake() {
        Bicycle bicycle = new Bicycle();
        bicycle.brake();
        assertEquals(bicycle.currentSpeed(),  -3);
    }

    @Test
    public void shouldStop() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(bicycle.currentSpeed(), 0);
    }

    @Test
    public void shouldGetCurrentSpeed() {
        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        assertEquals(bicycle.currentSpeed(), 5);
    }
}
