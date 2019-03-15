package bicycles;

//import bicycles.models.MountainBike;
//import bicycles.models.RoadBike;

public class BikeRide {

    private Bicycle bicycle;

    public BikeRide(Bicycle bicycle) {

        this.bicycle = bicycle;

    }


    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
    
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }


}
