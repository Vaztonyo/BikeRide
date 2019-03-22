package bicycles.specs;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.specs.BicycleSpecification;
import bicycles.specs.BicycleFromSpec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {
    @Test
    public void shouldGetAccelerationSpeed() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
//        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        assertEquals(roadBikeSpec.getAccelerationSpeed(), 11);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(9, -5, BicycleType.TandemBike);
        assertEquals(tandemBikeSpec.getAccelerationSpeed(), 9);
    }

    @Test
    public void shouldGetBrakeSpeed() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
//        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(9, -5, BicycleType.TandemBike);
        assertEquals(tandemBikeSpec.getBrakeSpeed(), -5);

    }

    @Test
    public void shouldGetBikeType() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(9, -5, BicycleType.TandemBike);
//        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
        assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.TandemBike);

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        assertEquals(mountainBikeSpec.getBicycleType(), BicycleType.MountainBike);
    }
}
