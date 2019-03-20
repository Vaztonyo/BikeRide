package bicycles;

public interface Bicycle {
//    int speed = 0;

     void accelerate();

     void stop();

     int currentSpeed();

     void brake();

     BicycleType getBicycleType();
}

