package bicycles;

//import bicycles.models.MountainBike;
//import bicycles.models.RoadBike;

import bicycles.specs.BicycleFromSpec;
import bicycles.specs.BicycleSpecification;
import bicycles.BicycleType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import bicycles.FunRide;



public class FunRideTest {

    @Test
    public void shouldSeeIfBikeIsAccepted() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        FunRide funRide = new FunRide(2);
        assertEquals(funRide.accept(roadBike), "Accepted");

        BicycleSpecification mountBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountBike = new BicycleFromSpec(mountBikeSpec);
        assertEquals(funRide.accept(mountBike), "Accepted");

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        assertEquals(funRide.accept(tandemBike), "Rejected");
    }

    @Test
    public void shouldGetNumOfBikesOnFunRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);

        BicycleSpecification mountBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountBike = new BicycleFromSpec(mountBikeSpec);

        FunRide funRide = new FunRide(4);

        funRide.accept(roadBike);
        funRide.accept(mountBike);
        funRide.accept(tandemBike);

        assertEquals(funRide.getEnteredCount(), 3);
        Bicycle tandemBike2 = new BicycleFromSpec(tandemBikeSpec);
        funRide.accept(tandemBike2);
        assertEquals(funRide.getEnteredCount(), 4);

    }

    @Test
    public void shouldCountTheNumOfBikesWithGivenType() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);

        BicycleSpecification mountBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountBike = new BicycleFromSpec(mountBikeSpec);

        Bicycle tandemBike2 = new BicycleFromSpec(tandemBikeSpec);
        Bicycle tandemBike3 = new BicycleFromSpec(tandemBikeSpec);

        Bicycle mountBike2 = new BicycleFromSpec(mountBikeSpec);


        FunRide funRide = new FunRide(7);

        funRide.accept(roadBike);
        funRide.accept(mountBike);
        funRide.accept(tandemBike);
        funRide.accept(mountBike2);
        funRide.accept(tandemBike2);
        funRide.accept(tandemBike3);

        System.out.println(funRide.getCountForType(BicycleType.MountainBike));
        assertEquals(funRide.getCountForType(BicycleType.TandemBike), 3);

        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 2);
    }

}
